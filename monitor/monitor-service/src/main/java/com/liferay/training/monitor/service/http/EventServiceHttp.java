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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.monitor.service.EventServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>EventServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EventServiceSoap
 * @generated
 */
public class EventServiceHttp {

	public static com.liferay.training.monitor.model.Event addEvent(
			HttpPrincipal httpPrincipal, long userId, String userName,
			java.util.Date eventDate, String eventType, String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "addEvent", _addEventParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, userName, eventDate, eventType, ipAddress,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.monitor.model.Event)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.monitor.model.Event deleteEvent(
			HttpPrincipal httpPrincipal, long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "deleteEvent",
				_deleteEventParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, eventId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.monitor.model.Event)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.monitor.model.Event getEvent(
			HttpPrincipal httpPrincipal, long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getEvent", _getEventParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, eventId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.monitor.model.Event)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.monitor.model.Event updateEvent_(
			HttpPrincipal httpPrincipal, long eventId, long userId,
			String userName, java.util.Date eventDate, String eventType,
			String ipAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "updateEvent_",
				_updateEvent_ParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventId, userId, userName, eventDate, eventType,
				ipAddress, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.monitor.model.Event)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByCompanyId(HttpPrincipal httpPrincipal, long companyId) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getEventsByCompanyId",
				_getEventsByCompanyIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, companyId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getAllEvents",
				_getAllEventsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(HttpPrincipal httpPrincipal, String eventType) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getEventsByEventType",
				_getEventsByEventTypeParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventType);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(
			HttpPrincipal httpPrincipal, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getAllEvents",
				_getAllEventsParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEventsByUserId(
			HttpPrincipal httpPrincipal, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getAllEventsByUserId",
				_getAllEventsByUserIdParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countEventsByGroupId(
		HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "countEventsByGroupId",
				_countEventsByGroupIdParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countEventsByEventType(
		HttpPrincipal httpPrincipal, String eventType) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "countEventsByEventType",
				_countEventsByEventTypeParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventType);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countEventsByUserId(
		HttpPrincipal httpPrincipal, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "countEventsByUserId",
				_countEventsByUserIdParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countEventsByEventTypeAndUserId(
		HttpPrincipal httpPrincipal, String eventType, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "countEventsByEventTypeAndUserId",
				_countEventsByEventTypeAndUserIdParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventType, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(
			HttpPrincipal httpPrincipal, long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getAllEvents",
				_getAllEventsParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getAllEvents(HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getAllEvents",
				_getAllEventsParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(
			HttpPrincipal httpPrincipal, String eventType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getEventsByEventType",
				_getEventsByEventTypeParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventType, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventTypeAndUserId(
			HttpPrincipal httpPrincipal, long userId, String eventType,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.monitor.model.Event> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getEventsByEventTypeAndUserId",
				_getEventsByEventTypeAndUserIdParameterTypes16);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, eventType, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.monitor.model.Event>
		getEventsByEventType(
			HttpPrincipal httpPrincipal, String eventType, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				EventServiceUtil.class, "getEventsByEventType",
				_getEventsByEventTypeParameterTypes17);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventType, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.monitor.model.Event>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EventServiceHttp.class);

	private static final Class<?>[] _addEventParameterTypes0 = new Class[] {
		long.class, String.class, java.util.Date.class, String.class,
		String.class, com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deleteEventParameterTypes1 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getEventParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _updateEvent_ParameterTypes3 = new Class[] {
		long.class, long.class, String.class, java.util.Date.class,
		String.class, String.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _getEventsByCompanyIdParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getAllEventsParameterTypes5 =
		new Class[] {};
	private static final Class<?>[] _getEventsByEventTypeParameterTypes6 =
		new Class[] {String.class};
	private static final Class<?>[] _getAllEventsParameterTypes7 = new Class[] {
		int.class, int.class,
		com.liferay.portal.kernel.util.OrderByComparator.class
	};
	private static final Class<?>[] _getAllEventsByUserIdParameterTypes8 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _countEventsByGroupIdParameterTypes9 =
		new Class[] {long.class};
	private static final Class<?>[] _countEventsByEventTypeParameterTypes10 =
		new Class[] {String.class};
	private static final Class<?>[] _countEventsByUserIdParameterTypes11 =
		new Class[] {long.class};
	private static final Class<?>[]
		_countEventsByEventTypeAndUserIdParameterTypes12 = new Class[] {
			String.class, long.class
		};
	private static final Class<?>[] _getAllEventsParameterTypes13 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getAllEventsParameterTypes14 =
		new Class[] {int.class, int.class};
	private static final Class<?>[] _getEventsByEventTypeParameterTypes15 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_getEventsByEventTypeAndUserIdParameterTypes16 = new Class[] {
			long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getEventsByEventTypeParameterTypes17 =
		new Class[] {String.class, int.class, int.class};

}