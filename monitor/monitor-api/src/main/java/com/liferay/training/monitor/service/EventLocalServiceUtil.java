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

import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Event. This utility wraps
 * <code>com.liferay.training.monitor.service.impl.EventLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EventLocalService
 * @generated
 */
public class EventLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.monitor.service.impl.EventLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the event to the database. Also notifies the appropriate model listeners.
	 *
	 * @param event the event
	 * @return the event that was added
	 */
	public static com.liferay.training.monitor.model.Event addEvent(
		com.liferay.training.monitor.model.Event event) {

		return getService().addEvent(event);
	}

	public static com.liferay.training.monitor.model.Event addEvent(
			long userId, String userName, java.util.Date eventDate,
			String eventType, String ipAddress, ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addEvent(
			userId, userName, eventDate, eventType, ipAddress, serviceContext);
	}

	public static int countByEventType(String eventType) {
		return getService().countByEventType(eventType);
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

	/**
	 * Creates a new event with the primary key. Does not add the event to the database.
	 *
	 * @param eventId the primary key for the new event
	 * @return the new event
	 */
	public static com.liferay.training.monitor.model.Event createEvent(
		long eventId) {

		return getService().createEvent(eventId);
	}

	/**
	 * Deletes the event from the database. Also notifies the appropriate model listeners.
	 *
	 * @param event the event
	 * @return the event that was removed
	 */
	public static com.liferay.training.monitor.model.Event deleteEvent(
		com.liferay.training.monitor.model.Event event) {

		return getService().deleteEvent(event);
	}

	/**
	 * Deletes the event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the event
	 * @return the event that was removed
	 * @throws PortalException if a event with the primary key could not be found
	 */
	public static com.liferay.training.monitor.model.Event deleteEvent(
			long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEvent(eventId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.monitor.model.impl.EventModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.monitor.model.impl.EventModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.training.monitor.model.Event fetchEvent(
		long eventId) {

		return getService().fetchEvent(eventId);
	}

	/**
	 * Returns the event matching the UUID and group.
	 *
	 * @param uuid the event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching event, or <code>null</code> if a matching event could not be found
	 */
	public static com.liferay.training.monitor.model.Event
		fetchEventByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchEventByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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

	/**
	 * Returns the event with the primary key.
	 *
	 * @param eventId the primary key of the event
	 * @return the event
	 * @throws PortalException if a event with the primary key could not be found
	 */
	public static com.liferay.training.monitor.model.Event getEvent(
			long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEvent(eventId);
	}

	/**
	 * Returns the event matching the UUID and group.
	 *
	 * @param uuid the event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching event
	 * @throws PortalException if a matching event could not be found
	 */
	public static com.liferay.training.monitor.model.Event
			getEventByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEventByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.monitor.model.impl.EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of events
	 */
	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEvents(int start, int end) {

		return getService().getEvents(start, end);
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
	 * Returns all the events matching the UUID and company.
	 *
	 * @param uuid the UUID of the events
	 * @param companyId the primary key of the company
	 * @return the matching events, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getEventsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of events matching the UUID and company.
	 *
	 * @param uuid the UUID of the events
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching events, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		return getService().getEventsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of events.
	 *
	 * @return the number of events
	 */
	public static int getEventsCount() {
		return getService().getEventsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param event the event
	 * @return the event that was updated
	 */
	public static com.liferay.training.monitor.model.Event updateEvent(
		com.liferay.training.monitor.model.Event event) {

		return getService().updateEvent(event);
	}

	public static com.liferay.training.monitor.model.Event updateEvent(
			long eventId, long userId, String userName,
			java.util.Date eventDate, String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEvent(
			eventId, userId, userName, eventDate, eventType, ipAddress,
			serviceContext);
	}

	public static EventLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EventLocalService, EventLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EventLocalService.class);

		ServiceTracker<EventLocalService, EventLocalService> serviceTracker =
			new ServiceTracker<EventLocalService, EventLocalService>(
				bundle.getBundleContext(), EventLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}