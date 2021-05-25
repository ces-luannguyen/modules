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

package com.liferay.training.monitor.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Event}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Event
 * @generated
 */
public class EventWrapper
	extends BaseModelWrapper<Event> implements Event, ModelWrapper<Event> {

	public EventWrapper(Event event) {
		super(event);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("eventId", getEventId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userName", getUserName());
		attributes.put("userId", getUserId());
		attributes.put("eventDate", getEventDate());
		attributes.put("eventType", getEventType());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date eventDate = (Date)attributes.get("eventDate");

		if (eventDate != null) {
			setEventDate(eventDate);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	 * Returns the company ID of this event.
	 *
	 * @return the company ID of this event
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this event.
	 *
	 * @return the create date of this event
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the event date of this event.
	 *
	 * @return the event date of this event
	 */
	@Override
	public Date getEventDate() {
		return model.getEventDate();
	}

	/**
	 * Returns the event ID of this event.
	 *
	 * @return the event ID of this event
	 */
	@Override
	public long getEventId() {
		return model.getEventId();
	}

	/**
	 * Returns the event type of this event.
	 *
	 * @return the event type of this event
	 */
	@Override
	public String getEventType() {
		return model.getEventType();
	}

	/**
	 * Returns the group ID of this event.
	 *
	 * @return the group ID of this event
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ip address of this event.
	 *
	 * @return the ip address of this event
	 */
	@Override
	public String getIpAddress() {
		return model.getIpAddress();
	}

	/**
	 * Returns the modified date of this event.
	 *
	 * @return the modified date of this event
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this event.
	 *
	 * @return the primary key of this event
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this event.
	 *
	 * @return the user ID of this event
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this event.
	 *
	 * @return the user name of this event
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this event.
	 *
	 * @return the user uuid of this event
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this event.
	 *
	 * @return the uuid of this event
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this event.
	 *
	 * @param companyId the company ID of this event
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this event.
	 *
	 * @param createDate the create date of this event
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the event date of this event.
	 *
	 * @param eventDate the event date of this event
	 */
	@Override
	public void setEventDate(Date eventDate) {
		model.setEventDate(eventDate);
	}

	/**
	 * Sets the event ID of this event.
	 *
	 * @param eventId the event ID of this event
	 */
	@Override
	public void setEventId(long eventId) {
		model.setEventId(eventId);
	}

	/**
	 * Sets the event type of this event.
	 *
	 * @param eventType the event type of this event
	 */
	@Override
	public void setEventType(String eventType) {
		model.setEventType(eventType);
	}

	/**
	 * Sets the group ID of this event.
	 *
	 * @param groupId the group ID of this event
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ip address of this event.
	 *
	 * @param ipAddress the ip address of this event
	 */
	@Override
	public void setIpAddress(String ipAddress) {
		model.setIpAddress(ipAddress);
	}

	/**
	 * Sets the modified date of this event.
	 *
	 * @param modifiedDate the modified date of this event
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this event.
	 *
	 * @param primaryKey the primary key of this event
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this event.
	 *
	 * @param userId the user ID of this event
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this event.
	 *
	 * @param userName the user name of this event
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this event.
	 *
	 * @param userUuid the user uuid of this event
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this event.
	 *
	 * @param uuid the uuid of this event
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EventWrapper wrap(Event event) {
		return new EventWrapper(event);
	}

}