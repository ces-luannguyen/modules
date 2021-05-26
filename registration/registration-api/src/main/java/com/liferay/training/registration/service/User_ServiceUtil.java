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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for User_. This utility wraps
 * <code>com.liferay.training.registration.service.impl.User_ServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see User_Service
 * @generated
 */
public class User_ServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.registration.service.impl.User_ServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>User_ServiceUtil</code> to access the user_ remote service.
	 */
	public static com.liferay.training.registration.model.User_ addUser_(
			String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDay,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addUser_(
			userName, firstName, lastName, emailAddress, male, birthDay,
			password, confirmPassword, homePhone, mobilePhone, address1,
			address2, city, state, zipCode, securityQuestion, answer,
			termsOfUse, serviceContext);
	}

	public static int countUsersByZipCode(String zipCode) {
		return getService().countUsersByZipCode(zipCode);
	}

	public static com.liferay.training.registration.model.User_ deleteUser_(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteUser_(userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.registration.model.User_ getUser_(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUser_(userId);
	}

	public static java.util.List<com.liferay.training.registration.model.User_>
		getUsersByZipCode(String zipCode) {

		return getService().getUsersByZipCode(zipCode);
	}

	public static java.util.List<com.liferay.training.registration.model.User_>
		getUsersByZipCode(String zipCode, int start, int end) {

		return getService().getUsersByZipCode(zipCode, start, end);
	}

	public static com.liferay.training.registration.model.User_ updateUser__(
			long userId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDate,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateUser__(
			userId, userName, firstName, lastName, emailAddress, male,
			birthDate, password, confirmPassword, homePhone, mobilePhone,
			address1, address2, city, state, zipCode, securityQuestion, answer,
			termsOfUse, serviceContext);
	}

	public static User_Service getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<User_Service, User_Service> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(User_Service.class);

		ServiceTracker<User_Service, User_Service> serviceTracker =
			new ServiceTracker<User_Service, User_Service>(
				bundle.getBundleContext(), User_Service.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}