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
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.training.registration.model.User_;
import com.liferay.training.registration.service.base.User_LocalServiceBaseImpl;
import com.liferay.training.registration.validator.UserValidator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the user_ local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.registration.service.User_LocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_LocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.training.registration.model.User_",
	service = AopService.class
)
public class User_LocalServiceImpl extends User_LocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.training.registration.service.User_LocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.training.registration.service.User_LocalServiceUtil</code>.
	 */
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.training.registration.service.User_LocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.training.registration.service.User_LocalServiceUtil</code>.
	 */
	public User_ addUser_(
		     String userName, String firstName, String lastName, String emailAddress, boolean male,
		     Date birthDay, String password, String confirmPassword, String homePhone, String mobilePhone,
		     String address1, String address2, String city, String state, String zipCode, String securityQuestion,
		     String answer, boolean termsOfUse, ServiceContext serviceContext)
		     throws PortalException {

			// Validate user parameters.
		
	     	_userValidator.validate(userName, firstName, lastName, emailAddress, birthDay, password, confirmPassword, homePhone, mobilePhone, address1, address2, city, state, zipCode, securityQuestion, answer, termsOfUse);

	     	
		     // Generate primary key for the user.

		     long userId =
		         counterLocalService.increment(User_.class.getName());

		     // Create user. This doesn't yet persist the entity.

		     User_ user = createUser_(userId);

		     // Populate fields.
		     user.setGroupId(serviceContext.getScopeGroupId());
		     user.setCompanyId(CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID)).getCompanyId());
		     user.setCreateDate(serviceContext.getCreateDate(new Date()));
		     user.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		     user.setUserId(userId);
		     user.setAddress1(address1);
		     user.setAddress2(address2);
		     user.setAnswer(answer);
		     user.setBirthDay(birthDay);
		     user.setCity(city);
		     user.setConfirmPassword(confirmPassword);
		     user.setEmailAddress(emailAddress);
		     user.setFirstName(firstName);
		     user.setHomePhone(homePhone);
		     user.setLastName(lastName);
		     user.setMale(male);
		     user.setMobilePhone(mobilePhone);
		     user.setPassword(password);
		     user.setSecurityQuestion(securityQuestion);
		     user.setState(state);
		     user.setTermsOfUse(termsOfUse);
		     user.setUserName(userName);
		     user.setZipCode(zipCode);
		     // Persist user to database.

		     return super.addUser_(user);
		 }
	
	public User_ updateUser_(
		     long userId, String userName, String firstName, String lastName, String emailAddress, boolean male,
		     Date birthDay, String password, String confirmPassword, String homePhone, String mobilePhone,
		     String address1, String address2, String city, String state, String zipCode, String securityQuestion,
		     String answer, boolean termsOfUse, ServiceContext serviceContext)
		     throws PortalException {

			// Validate user parameters.
		
	     	_userValidator.validate(userName, firstName, lastName, emailAddress, birthDay, password, confirmPassword, homePhone, mobilePhone, address1, address2, city, state, zipCode, securityQuestion, answer, termsOfUse);
		
		     // Get the Assignment by id.

		     User_ user = getUser_(userId);

		     // Set updated fields and modification date.

		     user.setModifiedDate(new Date());
		     user.setAddress1(address1);
		     user.setAddress2(address2);
		     user.setAnswer(answer);
		     user.setBirthDay(birthDay);
		     user.setCity(city);
		     user.setConfirmPassword(confirmPassword);
		     user.setEmailAddress(emailAddress);
		     user.setFirstName(firstName);
		     user.setHomePhone(homePhone);
		     user.setLastName(lastName);
		     user.setMale(male);
		     user.setMobilePhone(mobilePhone);
		     user.setPassword(password);
		     user.setSecurityQuestion(securityQuestion);
		     user.setState(state);
		     user.setTermsOfUse(termsOfUse);
		     user.setUserName(userName);
		     user.setZipCode(zipCode);

		     user = super.updateUser_(user);

		     return user;
		 }
	
	
	public List<User_> getUsersByUserName(String userName) {

        return user_Persistence.findByUserName(userName);
    }
	
	public List<User_> getUsersByZipCode(String zipCode) {

        return user_Persistence.findByZipCode(zipCode);
    }
	
	public List<User_> getUsersByZipCode(String zipCode, int start, int end) {

        return user_Persistence.findByZipCode(zipCode, start, end);
    }
	 
	public int countUsersByZipCode(String zipCode) {
		return user_Persistence.countByZipCode(zipCode);
	}
	@Override
	public User_ addUser_(User_ user) {

		throw new UnsupportedOperationException("Not supported.");
	}

	@Override
	public User_ updateUser_(User_ user) {

		throw new UnsupportedOperationException("Not supported.");
	}
	
	@Reference
	 UserValidator _userValidator;
}