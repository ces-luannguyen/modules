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

package com.liferay.training.registration.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.registration.service.User_ServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>User_ServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.registration.model.User_Soap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.registration.model.User_</code>, that is translated to a
 * <code>com.liferay.training.registration.model.User_Soap</code>. Methods that SOAP
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
 * @see User_ServiceHttp
 * @generated
 */
public class User_ServiceSoap {

	public static com.liferay.training.registration.model.User_Soap addUser_(
			String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDay,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.registration.model.User_ returnValue =
				User_ServiceUtil.addUser_(
					userName, firstName, lastName, emailAddress, male, birthDay,
					password, confirmPassword, homePhone, mobilePhone, address1,
					address2, city, state, zipCode, securityQuestion, answer,
					termsOfUse, serviceContext);

			return com.liferay.training.registration.model.User_Soap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.registration.model.User_Soap deleteUser_(
			long userId)
		throws RemoteException {

		try {
			com.liferay.training.registration.model.User_ returnValue =
				User_ServiceUtil.deleteUser_(userId);

			return com.liferay.training.registration.model.User_Soap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.registration.model.User_Soap getUser_(
			long userId)
		throws RemoteException {

		try {
			com.liferay.training.registration.model.User_ returnValue =
				User_ServiceUtil.getUser_(userId);

			return com.liferay.training.registration.model.User_Soap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.registration.model.User_Soap
			updateUser__(
				long userId, String userName, String firstName, String lastName,
				String emailAddress, boolean male, java.util.Date birthDate,
				String password, String confirmPassword, String homePhone,
				String mobilePhone, String address1, String address2,
				String city, String state, String zipCode,
				String securityQuestion, String answer, boolean termsOfUse,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.registration.model.User_ returnValue =
				User_ServiceUtil.updateUser__(
					userId, userName, firstName, lastName, emailAddress, male,
					birthDate, password, confirmPassword, homePhone,
					mobilePhone, address1, address2, city, state, zipCode,
					securityQuestion, answer, termsOfUse, serviceContext);

			return com.liferay.training.registration.model.User_Soap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(User_ServiceSoap.class);

}