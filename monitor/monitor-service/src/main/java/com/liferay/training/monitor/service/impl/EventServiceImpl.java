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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.monitor.service.base.EventServiceBaseImpl;
import com.liferay.training.monitor.model.Event;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.monitor.service.EventService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EventServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=monitor",
		"json.web.service.context.path=Event"
	},
	service = AopService.class
)
public class EventServiceImpl extends EventServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.training.monitor.service.EventServiceUtil</code> to access the event remote service.
	 */
	public Event addEvent(
			long userId, String userName, Date eventDate, String eventType, String ipAddress,
			ServiceContext serviceContext) throws PortalException {

		return eventLocalService.addEvent(userId, userName, eventDate, eventType, ipAddress);
	}

	public Event deleteEvent(long eventId) throws PortalException {

		Event event = eventLocalService.getEvent(eventId);

		return eventLocalService.deleteEvent(event);
	}

	public Event getEvent(long eventId) throws PortalException {

		Event event = eventLocalService.getEvent(eventId);

		return event;
	}

	

	public Event updateEvent_(long eventId, long userId, String userName,
			Date eventDate, String eventType, String ipAddress, ServiceContext serviceContext) 
					throws PortalException {

		return eventLocalService.updateEvent(eventId, userId, userName, eventDate, eventType,
				ipAddress, serviceContext);

	}
}