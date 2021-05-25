package com.liferay.training.monitor.web.portlet.action;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.monitor.model.Event;
import com.liferay.training.monitor.service.EventService;
import com.liferay.training.monitor.web.constants.AmfEventMonitorPortletKeys;
import com.liferay.training.monitor.web.constants.MVCCommandNames;
import com.liferay.training.monitor.web.internal.security.permission.resource.EventTopLevelPermission;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * MVC command for showing the event list.
 * 
 * @author liferay
 */
@Component(
    immediate = true, 
    property = {
        "javax.portlet.name=" + AmfEventMonitorPortletKeys.AMFEVENTMONITOR, 
        "mvc.command.name=/",
        "mvc.command.name=" + MVCCommandNames.VIEW_EVENTS
    }, 
    service = MVCRenderCommand.class
)
public class ViewEventsMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        // Add event list related attributes.

        addEventListAttributes(renderRequest);


        return "/view.jsp";
    }

    /**
     * Adds event list related attributes to the request.
     * 
     * @param renderRequest
     */
    private void addEventListAttributes(RenderRequest renderRequest) {

        ThemeDisplay themeDisplay =
            (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        ServiceContext serviceContext = null;
        try {
			serviceContext = ServiceContextFactory.getInstance(
			        Event.class.getName(), renderRequest);
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
        

        int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
        int end = start + delta;


        // Create comparator

        OrderByComparator<Event> comparator =
            OrderByComparatorFactoryUtil.create(
                "Event", "eventDate", false);

        
        List<Event> events_all_ =null;
        List<Event> events_reg_  = null;
        List<Event> events_log_ = null;
        
        long groupId = serviceContext.getScopeGroupId();
        long userId = serviceContext.getUserId();
        int events_all_count = 0;
        int events_reg_count = 0;
        int events_log_count = 0;
        
        if (!EventTopLevelPermission.contains(
        		themeDisplay.getPermissionChecker(),
        		themeDisplay.getScopeGroupId(), "VIEW_ALL")) {

            // User doesn't have permission to view all events
            
            events_all_count = _eventService.countEventsByUserId(userId);
            events_all_ =_eventService.getAllEventsByUserId(userId, start, end, comparator);
            events_reg_count = _eventService.countEventsByEventTypeAndUserId("Registration", userId);
            events_reg_ = _eventService.getEventsByEventTypeAndUserId(userId, "Registration", start, end, comparator);
            events_log_count = _eventService.countEventsByEventTypeAndUserId("Login", userId);
            events_log_ = _eventService.getEventsByEventTypeAndUserId(userId, "Login", start, end, comparator);
            
        }else {
			
        	// User has permission to view all events
			
			
			events_all_count = _eventService.countEventsByGroupId(groupId);
	        events_all_ =_eventService.getAllEvents(groupId,start, end, comparator);
	        events_reg_count = _eventService.countEventsByEventType("Registration");
	        events_reg_ = _eventService.getEventsByEventType("Registration", start, end, comparator);
	        events_log_count = _eventService.countEventsByEventType("Login");
	        events_log_ = _eventService.getEventsByEventType("Login", start, end, comparator);
		}

        // Set request attributes.
        
        
        
        renderRequest.setAttribute("delta", delta);
        renderRequest.setAttribute("events_all", events_all_);
        renderRequest.setAttribute("events_all_count",events_all_count);
        renderRequest.setAttribute("events_reg", events_reg_);
        renderRequest.setAttribute("events_reg_count",events_reg_count);
        renderRequest.setAttribute("events_log", events_log_);
        renderRequest.setAttribute("events_log_count",events_log_count);

        
        
		// tabs selection
		
		String selectedTab= ParamUtil.getString(renderRequest,"tabs");

		if (selectedTab != null && !("".equalsIgnoreCase(selectedTab))) {
			renderRequest.getPortletSession().setAttribute("selectedTab", selectedTab);
			renderRequest.setAttribute("selectedTab", selectedTab);
		} else {
			selectedTab = (String) renderRequest.getPortletSession().getAttribute("selectedTab");
			renderRequest.setAttribute("selectedTab", selectedTab);
		}
		
		

    }



    @Reference
    protected EventService _eventService;

}