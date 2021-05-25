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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Event. This utility wraps
 * <code>com.liferay.training.monitor.service.impl.EventServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EventService
 * @generated
 */
public class EventServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.monitor.service.impl.EventServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.monitor.model.Event addEvent(
			long userId, String userName, java.util.Date eventDate,
			String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addEvent(
			userId, userName, eventDate, eventType, ipAddress, serviceContext);
	}

	public static int countEventsByEventType(String eventType) {
		return getService().countEventsByEventType(eventType);
	}

	public static int countEventsByEventTypeAndUserId(
		String eventType, long userId) {

		return getService().countEventsByEventTypeAndUserId(eventType, userId);
	}

	public static int countEventsByGroupId(long groupId) {
		return getService().countEventsByGroupId(groupId);
	}

	public static int countEventsByUserId(long userId) {
		return getService().countEventsByUserId(userId);
	}

	public static com.liferay.training.monitor.model.Event deleteEvent(
			long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEvent(eventId);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents() {

		return getService().getAllEvents();
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(int start, int end) {

		return getService().getAllEvents(start, end);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return getService().getAllEvents(start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return getService().getAllEvents(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEventsByUserId(
			long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return getService().getAllEventsByUserId(
			userId, start, end, orderByComparator);
	}

	public static com.liferay.training.monitor.model.Event getEvent(
			long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEvent(eventId);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByCompanyId(long companyId) {

		return getService().getEventsByCompanyId(companyId);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(String eventType) {

		return getService().getEventsByEventType(eventType);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(String eventType, int start, int end) {

		return getService().getEventsByEventType(eventType, start, end);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(
			String eventType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return getService().getEventsByEventType(
			eventType, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventTypeAndUserId(
			long userId, String eventType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return getService().getEventsByEventTypeAndUserId(
			userId, eventType, start, end, orderByComparator);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.monitor.model.Event updateEvent_(
			long eventId, long userId, String userName,
			java.util.Date eventDate, String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEvent_(
			eventId, userId, userName, eventDate, eventType, ipAddress,
			serviceContext);
	}

	public static EventService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EventService, EventService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EventService.class);

		ServiceTracker<EventService, EventService> serviceTracker =
			new ServiceTracker<EventService, EventService>(
				bundle.getBundleContext(), EventService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}