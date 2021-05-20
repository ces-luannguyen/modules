package com.liferay.training.monitor.web.portlet.action;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.monitor.model.Event;
import com.liferay.training.monitor.service.EventService;
import com.liferay.training.monitor.web.constants.AmfEventMonitorPortletKeys;
import com.liferay.training.monitor.web.constants.MVCCommandNames;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

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

        

        // Set request attributes.
        List<Event> events_all = _eventService.getAllEvents();
        List<Event> events_all_ =_eventService.getAllEvents(start, end, comparator);
        List<Event> events_reg = _eventService.getEventsByEventType("Registration");
        List<Event> events_reg_ = _eventService.getEventsByEventType("Registration", start, end, comparator);
        List<Event> events_log = _eventService.getEventsByEventType("Login");
        List<Event> events_log_ = _eventService.getEventsByEventType("Login", start, end, comparator);
        
        renderRequest.setAttribute("delta", delta);
        renderRequest.setAttribute("events_all", events_all_);
        renderRequest.setAttribute("events_all_count",events_all.size());
        renderRequest.setAttribute("events_reg", events_reg_);
        renderRequest.setAttribute("events_reg_count",events_reg.size());
        renderRequest.setAttribute("events_log", events_log_);
        renderRequest.setAttribute("events_log_count",events_log.size());


    }



    @Reference
    protected EventService _eventService;

    @Reference
    private Portal _portal;
}