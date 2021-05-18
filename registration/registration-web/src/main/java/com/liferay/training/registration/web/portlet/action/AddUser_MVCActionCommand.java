package com.liferay.training.registration.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.registration.exception.UserValidationException;
import com.liferay.training.registration.model.User_;
import com.liferay.training.registration.service.User_Service;
import com.liferay.training.registration.web.constants.AmfRegistrationPortletKeys;
import com.liferay.training.registration.web.constants.MVCCommandNames;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
    * MVC Action Command for adding users.
    * 
    * @author liferay
    */
@Component(
    immediate = true,
    property = {
        "javax.portlet.name=" + AmfRegistrationPortletKeys.AMFREGISTRATION,
        "mvc.command.name=" + MVCCommandNames.ADD_USER
    },
    service = MVCActionCommand.class
)
public class AddUser_MVCActionCommand extends BaseMVCActionCommand {

    @Override
    protected void doProcessAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws Exception {

        ThemeDisplay themeDisplay =
            (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
            User_.class.getName(), actionRequest);

        // Get parameters from the request.

        String firstName = ParamUtil.getString(actionRequest, "first_name");
        String lastName = ParamUtil.getString(actionRequest, "last_name");
        String emailAddress = ParamUtil.getString(actionRequest, "email_address");
        String username = ParamUtil.getString(actionRequest, "username");
        boolean male = ParamUtil.getBoolean(actionRequest, "male");
        String bDay = ParamUtil.getString(actionRequest, "b_day");
        String bMonth = ParamUtil.getString(actionRequest, "b_month");
        String bYear = ParamUtil.getString(actionRequest, "b_year");
        String password1 = ParamUtil.getString(actionRequest, "password1");
        String password2 = ParamUtil.getString(actionRequest, "password2");
        String homePhone = ParamUtil.getString(actionRequest, "home_phone");
        String mobilePhone = ParamUtil.getString(actionRequest, "mobile_phone");
        String address = ParamUtil.getString(actionRequest, "address");
        String address2 = ParamUtil.getString(actionRequest, "address2");
        String city = ParamUtil.getString(actionRequest, "city");
        String state = ParamUtil.getString(actionRequest, "state");
        String zip = ParamUtil.getString(actionRequest, "zip");
        String securityQuestion = ParamUtil.getString(actionRequest, "security_question");
        String securityAnswer = ParamUtil.getString(actionRequest, "security_answer");
        boolean acceptedTou = ParamUtil.getBoolean(actionRequest, "accepted_tou");
        
        

        Date birthDay = PortalUtil.getDate(Integer.parseInt(bMonth), Integer.parseInt(bDay), Integer.parseInt(bYear));
        
        try {

            // Call the service to add a a new user.

            _userService.addUser_(username, firstName, lastName, emailAddress, male, birthDay, password1, password2, homePhone, mobilePhone, address, address2, city, state, zip, securityQuestion, securityAnswer, acceptedTou, serviceContext);


            sendRedirect(actionRequest, actionResponse);
        }
        catch (UserValidationException uve) {

        	uve.printStackTrace();

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandNames.SIGN_UP);            

        }
        catch (PortalException pe) {


        	pe.printStackTrace();

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandNames.SIGN_UP);            
        }
    }

    @Reference
    protected User_Service _userService;

}