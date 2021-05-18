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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.registration.exception.NoSuchUser_Exception;
import com.liferay.training.registration.model.User_;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user_ service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_Util
 * @generated
 */
@ProviderType
public interface User_Persistence extends BasePersistence<User_> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link User_Util} to access the user_ persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user_s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user_s
	 */
	public java.util.List<User_> findByUuid(String uuid);

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
	public java.util.List<User_> findByUuid(String uuid, int start, int end);

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
	public java.util.List<User_> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

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
	public java.util.List<User_> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public User_ findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public User_ fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public User_ findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public User_ fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

	/**
	 * Returns the user_s before and after the current user_ in the ordered set where uuid = &#63;.
	 *
	 * @param userId the primary key of the current user_
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public User_[] findByUuid_PrevAndNext(
			long userId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Removes all the user_s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user_s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user_s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching user_s
	 */
	public java.util.List<User_> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<User_> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<User_> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

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
	public java.util.List<User_> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public User_ findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Returns the first user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public User_ fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public User_ findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Returns the last user_ in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public User_ fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

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
	public User_[] findByUuid_C_PrevAndNext(
			long userId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Removes all the user_s where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of user_s where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching user_s
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the user_s where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching user_s
	 */
	public java.util.List<User_> findByUserName(String userName);

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
	public java.util.List<User_> findByUserName(
		String userName, int start, int end);

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
	public java.util.List<User_> findByUserName(
		String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

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
	public java.util.List<User_> findByUserName(
		String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public User_ findByUserName_First(
			String userName,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Returns the first user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public User_ fetchByUserName_First(
		String userName,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

	/**
	 * Returns the last user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_
	 * @throws NoSuchUser_Exception if a matching user_ could not be found
	 */
	public User_ findByUserName_Last(
			String userName,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Returns the last user_ in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	public User_ fetchByUserName_Last(
		String userName,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

	/**
	 * Returns the user_s before and after the current user_ in the ordered set where userName = &#63;.
	 *
	 * @param userId the primary key of the current user_
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public User_[] findByUserName_PrevAndNext(
			long userId, String userName,
			com.liferay.portal.kernel.util.OrderByComparator<User_>
				orderByComparator)
		throws NoSuchUser_Exception;

	/**
	 * Removes all the user_s where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	public void removeByUserName(String userName);

	/**
	 * Returns the number of user_s where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching user_s
	 */
	public int countByUserName(String userName);

	/**
	 * Caches the user_ in the entity cache if it is enabled.
	 *
	 * @param user_ the user_
	 */
	public void cacheResult(User_ user_);

	/**
	 * Caches the user_s in the entity cache if it is enabled.
	 *
	 * @param user_s the user_s
	 */
	public void cacheResult(java.util.List<User_> user_s);

	/**
	 * Creates a new user_ with the primary key. Does not add the user_ to the database.
	 *
	 * @param userId the primary key for the new user_
	 * @return the new user_
	 */
	public User_ create(long userId);

	/**
	 * Removes the user_ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_ that was removed
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public User_ remove(long userId) throws NoSuchUser_Exception;

	public User_ updateImpl(User_ user_);

	/**
	 * Returns the user_ with the primary key or throws a <code>NoSuchUser_Exception</code> if it could not be found.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_
	 * @throws NoSuchUser_Exception if a user_ with the primary key could not be found
	 */
	public User_ findByPrimaryKey(long userId) throws NoSuchUser_Exception;

	/**
	 * Returns the user_ with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_, or <code>null</code> if a user_ with the primary key could not be found
	 */
	public User_ fetchByPrimaryKey(long userId);

	/**
	 * Returns all the user_s.
	 *
	 * @return the user_s
	 */
	public java.util.List<User_> findAll();

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
	public java.util.List<User_> findAll(int start, int end);

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
	public java.util.List<User_> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator);

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
	public java.util.List<User_> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<User_>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user_s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user_s.
	 *
	 * @return the number of user_s
	 */
	public int countAll();

}