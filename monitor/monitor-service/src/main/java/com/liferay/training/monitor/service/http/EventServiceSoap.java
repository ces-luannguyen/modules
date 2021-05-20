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

package com.liferay.training.monitor.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.monitor.service.EventServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>EventServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.monitor.model.EventSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.monitor.model.Event</code>, that is translated to a
 * <code>com.liferay.training.monitor.model.EventSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EventServiceHttp
 * @generated
 */
public class EventServiceSoap {

	public static com.liferay.training.monitor.model.EventSoap addEvent(
			long userId, String userName, java.util.Date eventDate,
			String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.monitor.model.Event returnValue =
				EventServiceUtil.addEvent(
					userId, userName, eventDate, eventType, ipAddress,
					serviceContext);

			return com.liferay.training.monitor.model.EventSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap deleteEvent(
			long eventId)
		throws RemoteException {

		try {
			com.liferay.training.monitor.model.Event returnValue =
				EventServiceUtil.deleteEvent(eventId);

			return com.liferay.training.monitor.model.EventSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap getEvent(
			long eventId)
		throws RemoteException {

		try {
			com.liferay.training.monitor.model.Event returnValue =
				EventServiceUtil.getEvent(eventId);

			return com.liferay.training.monitor.model.EventSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap updateEvent_(
			long eventId, long userId, String userName,
			java.util.Date eventDate, String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.monitor.model.Event returnValue =
				EventServiceUtil.updateEvent_(
					eventId, userId, userName, eventDate, eventType, ipAddress,
					serviceContext);

			return com.liferay.training.monitor.model.EventSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[]
			getEventsByCompanyId(long companyId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getEventsByCompanyId(companyId);

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[] getAllEvents()
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getAllEvents();

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[]
			getEventsByEventType(String eventType)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getEventsByEventType(eventType);

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[] getAllEvents(
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getAllEvents(
					start, end, orderByComparator);

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[] getAllEvents(
			int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getAllEvents(start, end);

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[]
			getEventsByEventType(
				String eventType, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.training.monitor.model.Event>
						orderByComparator)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getEventsByEventType(
					eventType, start, end, orderByComparator);

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.monitor.model.EventSoap[]
			getEventsByEventType(String eventType, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.monitor.model.Event>
				returnValue = EventServiceUtil.getEventsByEventType(
					eventType, start, end);

			return com.liferay.training.monitor.model.EventSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EventServiceSoap.class);

}