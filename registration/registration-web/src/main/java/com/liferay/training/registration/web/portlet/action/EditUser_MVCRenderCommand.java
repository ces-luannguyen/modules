package com.liferay.training.registration.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.training.registration.web.constants.AmfRegistrationPortletKeys;
import com.liferay.training.registration.web.constants.MVCCommandNames;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + AmfRegistrationPortletKeys.AMFREGISTRATION,
		"mvc.command.name=/", "mvc.command.name=" + MVCCommandNames.SIGN_UP
	},
	service = MVCRenderCommand.class
)
public class EditUser_MVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		return "/registration/signup.jsp";
	}

}