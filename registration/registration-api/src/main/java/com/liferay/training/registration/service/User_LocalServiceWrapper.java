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
 * Provides a wrapper for {@link User_LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see User_LocalService
 * @generated
 */
public class User_LocalServiceWrapper
	implements ServiceWrapper<User_LocalService>, User_LocalService {

	public User_LocalServiceWrapper(User_LocalService user_LocalService) {
		_user_LocalService = user_LocalService;
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

		return _user_LocalService.addUser_(
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
	@Override
	public com.liferay.training.registration.model.User_ addUser_(
		com.liferay.training.registration.model.User_ user_) {

		return _user_LocalService.addUser_(user_);
	}

	@Override
	public int countUsersByZipCode(String zipCode) {
		return _user_LocalService.countUsersByZipCode(zipCode);
	}

	/**
	 * Creates a new user_ with the primary key. Does not add the user_ to the database.
	 *
	 * @param userId the primary key for the new user_
	 * @return the new user_
	 */
	@Override
	public com.liferay.training.registration.model.User_ createUser_(
		long userId) {

		return _user_LocalService.createUser_(userId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_LocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user_ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_ that was removed
	 * @throws PortalException if a user_ with the primary key could not be found
	 */
	@Override
	public com.liferay.training.registration.model.User_ deleteUser_(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_LocalService.deleteUser_(userId);
	}

	/**
	 * Deletes the user_ from the database. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was removed
	 */
	@Override
	public com.liferay.training.registration.model.User_ deleteUser_(
		com.liferay.training.registration.model.User_ user_) {

		return _user_LocalService.deleteUser_(user_);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _user_LocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _user_LocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _user_LocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _user_LocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _user_LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _user_LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.registration.model.User_ fetchUser_(
		long userId) {

		return _user_LocalService.fetchUser_(userId);
	}

	/**
	 * Returns the user_ matching the UUID and group.
	 *
	 * @param uuid the user_'s UUID
	 * @param groupId the primary key of the group
	 * @return the matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	@Override
	public com.liferay.training.registration.model.User_
		fetchUser_ByUuidAndGroupId(String uuid, long groupId) {

		return _user_LocalService.fetchUser_ByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _user_LocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _user_LocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _user_LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _user_LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user_ with the primary key.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_
	 * @throws PortalException if a user_ with the primary key could not be found
	 */
	@Override
	public com.liferay.training.registration.model.User_ getUser_(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_LocalService.getUser_(userId);
	}

	/**
	 * Returns the user_ matching the UUID and group.
	 *
	 * @param uuid the user_'s UUID
	 * @param groupId the primary key of the group
	 * @return the matching user_
	 * @throws PortalException if a matching user_ could not be found
	 */
	@Override
	public com.liferay.training.registration.model.User_
			getUser_ByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_LocalService.getUser_ByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.training.registration.model.User_>
		getUser_s(int start, int end) {

		return _user_LocalService.getUser_s(start, end);
	}

	/**
	 * Returns all the user_s matching the UUID and company.
	 *
	 * @param uuid the UUID of the user_s
	 * @param companyId the primary key of the company
	 * @return the matching user_s, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.registration.model.User_>
		getUser_sByUuidAndCompanyId(String uuid, long companyId) {

		return _user_LocalService.getUser_sByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of user_s matching the UUID and company.
	 *
	 * @param uuid the UUID of the user_s
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching user_s, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.registration.model.User_>
		getUser_sByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.registration.model.User_>
					orderByComparator) {

		return _user_LocalService.getUser_sByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of user_s.
	 *
	 * @return the number of user_s
	 */
	@Override
	public int getUser_sCount() {
		return _user_LocalService.getUser_sCount();
	}

	@Override
	public java.util.List<com.liferay.training.registration.model.User_>
		getUsersByUserName(String userName) {

		return _user_LocalService.getUsersByUserName(userName);
	}

	@Override
	public java.util.List<com.liferay.training.registration.model.User_>
		getUsersByZipCode(String zipCode) {

		return _user_LocalService.getUsersByZipCode(zipCode);
	}

	@Override
	public java.util.List<com.liferay.training.registration.model.User_>
		getUsersByZipCode(String zipCode, int start, int end) {

		return _user_LocalService.getUsersByZipCode(zipCode, start, end);
	}

	@Override
	public com.liferay.training.registration.model.User_ updateUser_(
			long userId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, java.util.Date birthDay,
			String password, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String answer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _user_LocalService.updateUser_(
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
	@Override
	public com.liferay.training.registration.model.User_ updateUser_(
		com.liferay.training.registration.model.User_ user_) {

		return _user_LocalService.updateUser_(user_);
	}

	@Override
	public User_LocalService getWrappedService() {
		return _user_LocalService;
	}

	@Override
	public void setWrappedService(User_LocalService user_LocalService) {
		_user_LocalService = user_LocalService;
	}

	private User_LocalService _user_LocalService;

}