package com.liferay.training.searchresult.web.portlet.action;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.registration.model.User_;
import com.liferay.training.registration.service.User_Service;
import com.liferay.training.searchresult.web.constants.AmfSearchResultsPortletKeys;
import com.liferay.training.searchresult.web.constants.MVCCommandNames;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * MVC command for showing the user list.
 * 
 * @author liferay
 */
@Component(
    immediate = true, 
    property = {
        "javax.portlet.name=" + AmfSearchResultsPortletKeys.AMFSEARCHRESULTS, 
        "mvc.command.name=/",
        "mvc.command.name=" + MVCCommandNames.VIEW_SEARCH_RESULT
    }, 
    service = MVCRenderCommand.class
)
public class SearchResultMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

    	
    	
        // Add user list related attributes.

        addUser_ListAttributes(renderRequest);


        return "/view.jsp";
    }

    /**
     * Adds user list related attributes to the request.
     * 
     * @param renderRequest
     */
    private void addUser_ListAttributes(RenderRequest renderRequest) {

        ThemeDisplay themeDisplay =
            (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        ServiceContext serviceContext = null;
        try {
			serviceContext = ServiceContextFactory.getInstance(
			        User_.class.getName(), renderRequest);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        // Resolve start and end for the search.

        int currentPage = ParamUtil.getInteger(
            renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
            SearchContainer.DEFAULT_CUR);

        int delta = ParamUtil.getInteger(
            renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
            SearchContainer.DEFAULT_DELTA);
         delta = 5;

        int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
        int end = start + delta;

        
        List<User_> users_all_ =null;
        int users_all_count = 0;
        
        

        // Set request attributes.
        
        PortletSession session = renderRequest.getPortletSession();
        String zipCode = (String) session.getAttribute("LIFERAY_SHARED_zipCode", PortletSession.APPLICATION_SCOPE);


        
        users_all_ = _userService.getUsersByZipCode(zipCode, start, end);
        users_all_count = _userService.countUsersByZipCode(zipCode);
        
        renderRequest.setAttribute("users_all", users_all_);
        renderRequest.setAttribute("zipCode", zipCode);
        renderRequest.setAttribute("users_all_count", users_all_count);
        

        
        
		
		
		

    }



    @Reference
    protected User_Service _userService;

}