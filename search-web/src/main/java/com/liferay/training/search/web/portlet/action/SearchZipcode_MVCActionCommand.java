package com.liferay.training.search.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.search.web.constants.AmfSearchPortletKeys;
import com.liferay.training.search.web.constants.MVCCommandNames;
import com.liferay.training.search.web.internal.security.permission.resource.AmfSearchTopLevelPermission;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;

import org.osgi.service.component.annotations.Component;

/**
 * MVC Action Command for adding users.
 *
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + AmfSearchPortletKeys.AMFSEARCH,
		"mvc.command.name=" + MVCCommandNames.SEARCH_ZIPCODE,
		"com.liferay.portlet.private-session-attributes=false"
	},
	service = MVCActionCommand.class
)
public class SearchZipcode_MVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		if (!AmfSearchTopLevelPermission.contains(
				themeDisplay.getPermissionChecker(),
				themeDisplay.getScopeGroupId(), "VIEW_SEARCH")) {

			SessionErrors.add(actionRequest, "noPermission");
			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.VIEW_SEARCH_FORM);

			return;
		}

		String zip = ParamUtil.getString(actionRequest, "zip");

		if (!zip.matches("^[0-9]{5}$")) {
			SessionErrors.add(actionRequest, "zipCode5");
			actionResponse.setRenderParameter(
				"mvcRenderCommandName", MVCCommandNames.VIEW_SEARCH_FORM);
		}

		PortletSession session = actionRequest.getPortletSession();

		session.setAttribute(
			"LIFERAY_SHARED_zipCode", zip, PortletSession.APPLICATION_SCOPE);
	}

}