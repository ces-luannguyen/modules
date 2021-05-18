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

	@Override
	public com.liferay.training.registration.model.User_ addUser_(
			String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDay,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_Service.addUser_(
			userName, firstName, lastName, emailAddress, male, birthDay,
			password, confirmPassword, homePhone, mobilePhone, address1,
			address2, city, state, zipCode, securityQuestion, answer,
			termsOfUse, serviceContext);
	}

	@Override
	public com.liferay.training.registration.model.User_ deleteUser_(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_Service.deleteUser_(userId);
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
	public com.liferay.training.registration.model.User_ getUser_(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_Service.getUser_(userId);
	}

	@Override
	public com.liferay.training.registration.model.User_ updateUser__(
			long userId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDate,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_Service.updateUser__(
			userId, userName, firstName, lastName, emailAddress, male,
			birthDate, password, confirmPassword, homePhone, mobilePhone,
			address1, address2, city, state, zipCode, securityQuestion, answer,
			termsOfUse, serviceContext);
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