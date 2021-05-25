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

package com.liferay.training.monitor.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EventService}.
 *
 * @author Brian Wing Shun Chan
 * @see EventService
 * @generated
 */
public class EventServiceWrapper
	implements EventService, ServiceWrapper<EventService> {

	public EventServiceWrapper(EventService eventService) {
		_eventService = eventService;
	}

	@Override
	public com.liferay.training.monitor.model.Event addEvent(
			long userId, String userName, java.util.Date eventDate,
			String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventService.addEvent(
			userId, userName, eventDate, eventType, ipAddress, serviceContext);
	}

	@Override
	public int countEventsByEventType(String eventType) {
		return _eventService.countEventsByEventType(eventType);
	}

	@Override
	public int countEventsByEventTypeAndUserId(String eventType, long userId) {
		return _eventService.countEventsByEventTypeAndUserId(eventType, userId);
	}

	@Override
	public int countEventsByGroupId(long groupId) {
		return _eventService.countEventsByGroupId(groupId);
	}

	@Override
	public int countEventsByUserId(long userId) {
		return _eventService.countEventsByUserId(userId);
	}

	@Override
	public com.liferay.training.monitor.model.Event deleteEvent(long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventService.deleteEvent(eventId);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents() {

		return _eventService.getAllEvents();
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(int start, int end) {

		return _eventService.getAllEvents(start, end);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return _eventService.getAllEvents(start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return _eventService.getAllEvents(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getAllEventsByUserId(
			long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return _eventService.getAllEventsByUserId(
			userId, start, end, orderByComparator);
	}

	@Override
	public com.liferay.training.monitor.model.Event getEvent(long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventService.getEvent(eventId);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByCompanyId(long companyId) {

		return _eventService.getEventsByCompanyId(companyId);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(String eventType) {

		return _eventService.getEventsByEventType(eventType);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(String eventType, int start, int end) {

		return _eventService.getEventsByEventType(eventType, start, end);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(
			String eventType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return _eventService.getEventsByEventType(
			eventType, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventTypeAndUserId(
			long userId, String eventType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return _eventService.getEventsByEventTypeAndUserId(
			userId, eventType, start, end, orderByComparator);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _eventService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.monitor.model.Event updateEvent_(
			long eventId, long userId, String userName,
			java.util.Date eventDate, String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventService.updateEvent_(
			eventId, userId, userName, eventDate, eventType, ipAddress,
			serviceContext);
	}

	@Override
	public EventService getWrappedService() {
		return _eventService;
	}

	@Override
	public void setWrappedService(EventService eventService) {
		_eventService = eventService;
	}

	private EventService _eventService;

}