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

package com.liferay.training.registration.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.registration.model.User_;
import com.liferay.training.registration.service.base.User_ServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the user_ remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.registration.service.User_Service</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_ServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=registration",
		"json.web.service.context.path=User_"
	},
	service = AopService.class
)
public class User_ServiceImpl extends User_ServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.training.registration.service.User_ServiceUtil</code> to access the user_ remote service.
	 */
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.training.registration.service.User_ServiceUtil</code> to access the user_ remote service.
	 */
	public User_ addUser_(String userName, String firstName, String lastName, String emailAddress,
			boolean male, Date birthDay, String password, String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse, ServiceContext serviceContext) throws PortalException {

		return user_LocalService.addUser_(userName, firstName, lastName, emailAddress, male, birthDay,
				password, confirmPassword, homePhone, mobilePhone, address1, address2, city, state, zipCode,
				securityQuestion, answer, termsOfUse, serviceContext);
	}

	public User_ deleteUser_(long userId) throws PortalException {

		User_ user = user_LocalService.getUser_(userId);

		return user_LocalService.deleteUser_(user);
	}

	public User_ getUser_(long userId) throws PortalException {

		User_ user = user_LocalService.getUser_(userId);

		return user;
	}

	

	public User_ updateUser__(long userId, String userName, String firstName, String lastName, String emailAddress,
			boolean male, Date birthDate, String password, String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse, ServiceContext serviceContext) throws PortalException {

		return user_LocalService.updateUser_(userId, userName, firstName, lastName, emailAddress, male, birthDate,
				password, confirmPassword, homePhone, mobilePhone, address1, address2, city, state, zipCode,
				securityQuestion, answer, termsOfUse, serviceContext);

	}
}