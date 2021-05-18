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

package com.liferay.training.registration.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.registration.model.User_;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the user_ service. This utility wraps <code>com.liferay.training.registration.service.persistence.impl.User_PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_Persistence
 * @generated
 */
public class User_Util {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(User_ user_) {
		getPersistence().clearCache(user_);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, User_> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<User_> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<User_> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<User_> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<User_> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static User_ update(User_ user_) {
		return getPersistence().update(user_);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static User_ update(User_ user_, ServiceContext serviceContext) {
		return getPersistence().update(user_, serviceContext);
	}

	/**
	 * Returns all the user_s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user_s
	 */
	public static List<User_> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the user_s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @return the range of matching user_s
	 */
	public static List<User_> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the user_s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user_s
	 */
	public static List<User_> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<User_> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user_s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user_s
	 */
	public static List<User_> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<User_> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public static User_ findByUuid_First(
			String uuid, OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static User_ fetchByUuid_First(
		String uuid, OrderByComparator<User_> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public static User_ findByUuid_Last(
			String uuid, OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static User_ fetchByUuid_Last(
		String uuid, OrderByComparator<User_> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the user_s before and after the current user_ in the ordered set where uuid = &#63;.
	 *
	 * @param userId the primary key of the current user_
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public static User_[] findByUuid_PrevAndNext(
			long userId, String uuid,
			OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUuid_PrevAndNext(
			userId, uuid, orderByComparator);
	}

	/**
	 * Removes all the user_s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of user_s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user_s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching user_s
	 */
	public static List<User_> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @return the range of matching user_s
	 */
	public static List<User_> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user_s
	 */
	public static List<User_> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<User_> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user_s
	 */
	public static List<User_> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<User_> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public static User_ findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static User_ fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<User_> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public static User_ findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static User_ fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<User_> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the user_s before and after the current user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param userId the primary key of the current user_
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public static User_[] findByUuid_C_PrevAndNext(
			long userId, String uuid, long companyId,
			OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUuid_C_PrevAndNext(
			userId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the user_s where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching user_s
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the user_s where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching user_s
	 */
	public static List<User_> findByUserName(String userName) {
		return getPersistence().findByUserName(userName);
	}

	/**
	 * Returns a range of all the user_s where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @return the range of matching user_s
	 */
	public static List<User_> findByUserName(
		String userName, int start, int end) {

		return getPersistence().findByUserName(userName, start, end);
	}

	/**
	 * Returns an ordered range of all the user_s where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user_s
	 */
	public static List<User_> findByUserName(
		String userName, int start, int end,
		OrderByComparator<User_> orderByComparator) {

		return getPersistence().findByUserName(
			userName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user_s where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user_s
	 */
	public static List<User_> findByUserName(
		String userName, int start, int end,
		OrderByComparator<User_> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserName(
			userName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public static User_ findByUserName_First(
			String userName, OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUserName_First(
			userName, orderByComparator);
	}

	/**
	 * Returns the first user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static User_ fetchByUserName_First(
		String userName, OrderByComparator<User_> orderByComparator) {

		return getPersistence().fetchByUserName_First(
			userName, orderByComparator);
	}

	/**
	 * Returns the last user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public static User_ findByUserName_Last(
			String userName, OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUserName_Last(
			userName, orderByComparator);
	}

	/**
	 * Returns the last user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public static User_ fetchByUserName_Last(
		String userName, OrderByComparator<User_> orderByComparator) {

		return getPersistence().fetchByUserName_Last(
			userName, orderByComparator);
	}

	/**
	 * Returns the user_s before and after the current user_ in the ordered set where userName = &#63;.
	 *
	 * @param userId the primary key of the current user_
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public static User_[] findByUserName_PrevAndNext(
			long userId, String userName,
			OrderByComparator<User_> orderByComparator)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByUserName_PrevAndNext(
			userId, userName, orderByComparator);
	}

	/**
	 * Removes all the user_s where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	public static void removeByUserName(String userName) {
		getPersistence().removeByUserName(userName);
	}

	/**
	 * Returns the number of user_s where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching user_s
	 */
	public static int countByUserName(String userName) {
		return getPersistence().countByUserName(userName);
	}

	/**
	 * Caches the user_ in the entity cache if it is enabled.
	 *
	 * @param user_ the user_
	 */
	public static void cacheResult(User_ user_) {
		getPersistence().cacheResult(user_);
	}

	/**
	 * Caches the user_s in the entity cache if it is enabled.
	 *
	 * @param user_s the user_s
	 */
	public static void cacheResult(List<User_> user_s) {
		getPersistence().cacheResult(user_s);
	}

	/**
	 * Creates a new user_ with the primary key. Does not add the user_ to the database.
	 *
	 * @param userId the primary key for the new user_
	 * @return the new user_
	 */
	public static User_ create(long userId) {
		return getPersistence().create(userId);
	}

	/**
	 * Removes the user_ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_ that was removed
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public static User_ remove(long userId)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().remove(userId);
	}

	public static User_ updateImpl(User_ user_) {
		return getPersistence().updateImpl(user_);
	}

	/**
	 * Returns the user_ with the primary key or throws a <code>NoSuchUser_Exception</code> if it could not be found.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public static User_ findByPrimaryKey(long userId)
		throws com.liferay.training.registration.exception.
			NoSuchUser_Exception {

		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	 * Returns the user_ with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_, or <code>null</code> if a user_ with the primary key could not be found
	 */
	public static User_ fetchByPrimaryKey(long userId) {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	/**
	 * Returns all the user_s.
	 *
	 * @return the user_s
	 */
	public static List<User_> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the user_s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @return the range of user_s
	 */
	public static List<User_> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the user_s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user_s
	 */
	public static List<User_> findAll(
		int start, int end, OrderByComparator<User_> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user_s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>User_ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user_s
	 */
	public static List<User_> findAll(
		int start, int end, OrderByComparator<User_> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the user_s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of user_s.
	 *
	 * @return the number of user_s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static User_Persistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<User_Persistence, User_Persistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(User_Persistence.class);

		ServiceTracker<User_Persistence, User_Persistence> serviceTracker =
			new ServiceTracker<User_Persistence, User_Persistence>(
				bundle.getBundleContext(), User_Persistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}