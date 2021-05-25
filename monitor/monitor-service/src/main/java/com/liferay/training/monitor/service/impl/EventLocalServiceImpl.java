/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.monitor.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.training.monitor.model.Event;
import com.liferay.training.monitor.service.base.EventLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.monitor.service.EventLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EventLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.training.monitor.model.Event",
	service = AopService.class
)
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.training.monitor.service.EventLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.training.monitor.service.EventLocalServiceUtil</code>.
	 */
	public Event addEvent(
			long userId, String userName, Date eventDate, String eventType, String ipAddress)
		     throws PortalException {


		     // Generate primary key for the event.

		     long eventId =
		         counterLocalService.increment(Event.class.getName());

		     // Create event. This doesn't yet persist the entity.

		     Event event = createEvent(eventId);

		     // Populate fields.

		     event.setCompanyId(CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID)).getCompanyId());
		     event.setEventDate(eventDate);
		     event.setEventType(eventType);
		     event.setUserId(userId);
		     event.setUserName(userName);
		     event.setIpAddress(ipAddress);
		     
		     ServiceContext serviceContext =
	                 ServiceContextThreadLocal.getServiceContext();
		     event.setGroupId(serviceContext.getScopeGroupId());
		     
		     // Persist event to database.

		     event = super.addEvent(event);

		     // Add permission resources.

//		     boolean portletActions = false;
//		     boolean addGroupPermissions = true;
//		     boolean addGuestPermissions = true;
//
//		     resourceLocalService.addResources(
//		         event.getCompanyId(), event.getGroupId(), userId, Event.class.getName(),
//		         event.getEventId(), portletActions, addGroupPermissions,
//		         addGuestPermissions);

		     return event;
		 }
	
	public Event updateEvent(
		     long eventId, long userId, String userName, Date eventDate, String eventType, 
		     String ipAddress, ServiceContext serviceContext)
		     throws PortalException {

		
		     // Get the Event by id.

			 Event event = getEvent(eventId);

		     // Set updated fields and modification date.

		     event.setEventDate(eventDate);
		     event.setEventType(eventType);
		     event.setUserId(userId);
		     event.setUserName(userName);
		     event.setIpAddress(ipAddress);

		     event = super.updateEvent(event);

		     return event;
		 }
	
	public List<Event> getEventsByCompanyId(long companyId) {

	     return eventPersistence.findByCompanyId(companyId);
	 }
	
	public List<Event> getAllEvents(){
		
		return eventPersistence.findAll();
	}
	
	public List<Event> getEventsByEventType(String eventType){
		return eventPersistence.findByEventType(eventType);
	}
	
	public List<Event> getAllEvents(int start, int end, OrderByComparator<Event> orderByComparator){
		
		return eventPersistence.findAll(start, end, orderByComparator);
	}
	
	public int countEventsByGroupId(long groupId) {
		return eventPersistence.countByGroupId(groupId);
	}
	public int countByEventType(String eventType) {
		return eventPersistence.countByEventType(eventType);
	}
	public int countEventsByUserId(long userId) {
		return eventPersistence.countByUserId(userId);
	}
	
	public int countEventsByEventTypeAndUserId(String eventType, long userId) {
		return eventPersistence.countByUserIdAndEventType(userId, eventType);
	}
	
	public List<Event> getAllEvents(long groupId, int start, int end, OrderByComparator<Event> orderByComparator){
		
		return eventPersistence.findByGroupId(groupId, start, end, orderByComparator);
	}
	
	public List<Event> getAllEventsByUserId(long userId, int start, int end, OrderByComparator<Event> orderByComparator){
		
		return eventPersistence.findByUserId(userId, start, end, orderByComparator);
	}
	
	public List<Event> getAllEvents(int start, int end){
		
		return eventPersistence.findAll(start, end);
	}
	
	public List<Event> getEventsByEventType(String eventType, int start, int end, OrderByComparator<Event> orderByComparator){
		return eventPersistence.findByEventType(eventType, start, end, orderByComparator);
	}
	
	public List<Event> getEventsByEventTypeAndUserId(long userId, String eventType, int start, int end, OrderByComparator<Event> orderByComparator){
		return eventPersistence.findByUserIdAndEventType(userId, eventType, start, end, orderByComparator);
	}
	
	public List<Event> getEventsByEventType(String eventType, int start, int end){
		return eventPersistence.findByEventType(eventType, start, end);
	}
	 
	@Override
	public Event addEvent(Event event) {

		throw new UnsupportedOperationException("Not supported.");
	}

	@Override
	public Event updateEvent(Event event) {

		throw new UnsupportedOperationException("Not supported.");
	}
}