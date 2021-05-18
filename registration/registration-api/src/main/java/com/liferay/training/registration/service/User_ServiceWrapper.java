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

package com.liferay.training.registration.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link User_Service}.
 *
 * @author Brian Wing Shun Chan
 * @see User_Service
 * @generated
 */
public class User_ServiceWrapper
	implements ServiceWrapper<User_Service>, User_Service {

	public User_ServiceWrapper(User_Service user_Service) {
		_user_Service = user_Service;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _user_Service.getOSGiServiceIdentifier();
	}

	@Override
	public User_Service getWrappedService() {
		return _user_Service;
	}

	@Override
	public void setWrappedService(User_Service user_Service) {
		_user_Service = user_Service;
	}

	private User_Service _user_Service;

}