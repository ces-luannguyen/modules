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
 * Provides the local service utility for User_. This utility wraps
 * <code>com.liferay.training.registration.service.impl.User_LocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see User_LocalService
 * @generated
 */
public class User_LocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.registration.service.impl.User_LocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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

	/**
	 * Adds the user_ to the database. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was added
	 */
	public static com.liferay.training.registration.model.User_ addUser_(
		com.liferay.training.registration.model.User_ user_) {

		return getService().addUser_(user_);
	}

	public static int countUsersByZipCode(String zipCode) {
		return getService().countUsersByZipCode(zipCode);
	}

	/**
	 * Creates a new user_ with the primary key. Does not add the user_ to the database.
	 *
	 * @param userId the primary key for the new user_
	 * @return the new user_
	 */
	public static com.liferay.training.registration.model.User_ createUser_(
		long userId) {

		return getService().createUser_(userId);
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

	/**
	 * Deletes the user_ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_ that was removed
	 * @throws PortalException if a user_ with the primary key could not be found
	 */
	public static com.liferay.training.registration.model.User_ deleteUser_(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteUser_(userId);
	}

	/**
	 * Deletes the user_ from the database. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was removed
	 */
	public static com.liferay.training.registration.model.User_ deleteUser_(
		com.liferay.training.registration.model.User_ user_) {

		return getService().deleteUser_(user_);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.registration.model.impl.User_ModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.registration.model.impl.User_ModelImpl</code>.
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

	public static com.liferay.training.registration.model.User_ fetchUser_(
		long userId) {

		return getService().fetchUser_(userId);
	}

	/**
	 * Returns the user_ with the matching UUID and company.
	 *
	 * @param uuid the user_'s UUID
	 * @param companyId the primary key of the company
	 * @return the matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static com.liferay.training.registration.model.User_
		fetchUser_ByUuidAndCompanyId(String uuid, long companyId) {

		return getService().fetchUser_ByUuidAndCompanyId(uuid, companyId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the user_ with the primary key.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_
	 * @throws PortalException if a user_ with the primary key could not be found
	 */
	public static com.liferay.training.registration.model.User_ getUser_(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUser_(userId);
	}

	/**
	 * Returns the user_ with the matching UUID and company.
	 *
	 * @param uuid the user_'s UUID
	 * @param companyId the primary key of the company
	 * @return the matching user_
	 * @throws PortalException if a matching user_ could not be found
	 */
	public static com.liferay.training.registration.model.User_
			getUser_ByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUser_ByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of all the user_s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.registration.model.impl.User_ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @return the range of user_s
	 */
	public static java.util.List<com.liferay.training.registration.model.User_>
		getUser_s(int start, int end) {

		return getService().getUser_s(start, end);
	}

	/**
	 * Returns the number of user_s.
	 *
	 * @return the number of user_s
	 */
	public static int getUser_sCount() {
		return getService().getUser_sCount();
	}

	public static java.util.List<com.liferay.training.registration.model.User_>
		getUsersByUserName(String userName) {

		return getService().getUsersByUserName(userName);
	}

	public static java.util.List<com.liferay.training.registration.model.User_>
		getUsersByZipCode(String zipCode) {

		return getService().getUsersByZipCode(zipCode);
	}

	public static java.util.List<com.liferay.training.registration.model.User_>
		getUsersByZipCode(String zipCode, int start, int end) {

		return getService().getUsersByZipCode(zipCode, start, end);
	}

	public static com.liferay.training.registration.model.User_ updateUser_(
			long userId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDay,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateUser_(
			userId, userName, firstName, lastName, emailAddress, male, birthDay,
			password, confirmPassword, homePhone, mobilePhone, address1,
			address2, city, state, zipCode, securityQuestion, answer,
			termsOfUse, serviceContext);
	}

	/**
	 * Updates the user_ in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was updated
	 */
	public static com.liferay.training.registration.model.User_ updateUser_(
		com.liferay.training.registration.model.User_ user_) {

		return getService().updateUser_(user_);
	}

	public static User_LocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<User_LocalService, User_LocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(User_LocalService.class);

		ServiceTracker<User_LocalService, User_LocalService> serviceTracker =
			new ServiceTracker<User_LocalService, User_LocalService>(
				bundle.getBundleContext(), User_LocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}