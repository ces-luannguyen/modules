package com.liferay.training.search.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.training.search.web.constants.AmfSearchPortletKeys;
import com.liferay.training.search.web.constants.MVCCommandNames;

import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + AmfSearchPortletKeys.AMFSEARCH,
		"mvc.command.name=/",
		"mvc.command.name=" + MVCCommandNames.VIEW_SEARCH_FORM
	},
	service = MVCRenderCommand.class
)
public class SearchZipcode_MVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		PortletSession session = renderRequest.getPortletSession();

		String zipCode = (String)session.getAttribute(
			"LIFERAY_SHARED_zipCode", PortletSession.APPLICATION_SCOPE);

		if (zipCode != null)

			renderRequest.setAttribute("zipCode", zipCode);

		return "/view.jsp";
	}

}