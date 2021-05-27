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

package com.liferay.training.registration.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link User_}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_
 * @generated
 */
public class User_Wrapper
	extends BaseModelWrapper<User_> implements ModelWrapper<User_>, User_ {

	public User_Wrapper(User_ user_) {
		super(user_);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userId", getUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("male", isMale());
		attributes.put("birthDay", getBirthDay());
		attributes.put("password", getPassword());
		attributes.put("confirmPassword", getConfirmPassword());
		attributes.put("homePhone", getHomePhone());
		attributes.put("mobilePhone", getMobilePhone());
		attributes.put("address1", getAddress1());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zipCode", getZipCode());
		attributes.put("securityQuestion", getSecurityQuestion());
		attributes.put("answer", getAnswer());
		attributes.put("termsOfUse", isTermsOfUse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Boolean male = (Boolean)attributes.get("male");

		if (male != null) {
			setMale(male);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String confirmPassword = (String)attributes.get("confirmPassword");

		if (confirmPassword != null) {
			setConfirmPassword(confirmPassword);
		}

		String homePhone = (String)attributes.get("homePhone");

		if (homePhone != null) {
			setHomePhone(homePhone);
		}

		String mobilePhone = (String)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}

		String address1 = (String)attributes.get("address1");

		if (address1 != null) {
			setAddress1(address1);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}

		String securityQuestion = (String)attributes.get("securityQuestion");

		if (securityQuestion != null) {
			setSecurityQuestion(securityQuestion);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Boolean termsOfUse = (Boolean)attributes.get("termsOfUse");

		if (termsOfUse != null) {
			setTermsOfUse(termsOfUse);
		}
	}

	/**
	 * Returns the address1 of this user_.
	 *
	 * @return the address1 of this user_
	 */
	@Override
	public String getAddress1() {
		return model.getAddress1();
	}

	/**
	 * Returns the address2 of this user_.
	 *
	 * @return the address2 of this user_
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the answer of this user_.
	 *
	 * @return the answer of this user_
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the birth day of this user_.
	 *
	 * @return the birth day of this user_
	 */
	@Override
	public Date getBirthDay() {
		return model.getBirthDay();
	}

	/**
	 * Returns the city of this user_.
	 *
	 * @return the city of this user_
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this user_.
	 *
	 * @return the company ID of this user_
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the confirm password of this user_.
	 *
	 * @return the confirm password of this user_
	 */
	@Override
	public String getConfirmPassword() {
		return model.getConfirmPassword();
	}

	/**
	 * Returns the create date of this user_.
	 *
	 * @return the create date of this user_
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this user_.
	 *
	 * @return the email address of this user_
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the first name of this user_.
	 *
	 * @return the first name of this user_
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this user_.
	 *
	 * @return the group ID of this user_
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home phone of this user_.
	 *
	 * @return the home phone of this user_
	 */
	@Override
	public String getHomePhone() {
		return model.getHomePhone();
	}

	/**
	 * Returns the last name of this user_.
	 *
	 * @return the last name of this user_
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the male of this user_.
	 *
	 * @return the male of this user_
	 */
	@Override
	public boolean getMale() {
		return model.getMale();
	}

	/**
	 * Returns the mobile phone of this user_.
	 *
	 * @return the mobile phone of this user_
	 */
	@Override
	public String getMobilePhone() {
		return model.getMobilePhone();
	}

	/**
	 * Returns the modified date of this user_.
	 *
	 * @return the modified date of this user_
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the password of this user_.
	 *
	 * @return the password of this user_
	 */
	@Override
	public String getPassword() {
		return model.getPassword();
	}

	/**
	 * Returns the primary key of this user_.
	 *
	 * @return the primary key of this user_
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the security question of this user_.
	 *
	 * @return the security question of this user_
	 */
	@Override
	public String getSecurityQuestion() {
		return model.getSecurityQuestion();
	}

	/**
	 * Returns the state of this user_.
	 *
	 * @return the state of this user_
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the terms of use of this user_.
	 *
	 * @return the terms of use of this user_
	 */
	@Override
	public boolean getTermsOfUse() {
		return model.getTermsOfUse();
	}

	/**
	 * Returns the user ID of this user_.
	 *
	 * @return the user ID of this user_
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this user_.
	 *
	 * @return the user name of this user_
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this user_.
	 *
	 * @return the user uuid of this user_
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user_.
	 *
	 * @return the uuid of this user_
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip code of this user_.
	 *
	 * @return the zip code of this user_
	 */
	@Override
	public String getZipCode() {
		return model.getZipCode();
	}

	/**
	 * Returns <code>true</code> if this user_ is male.
	 *
	 * @return <code>true</code> if this user_ is male; <code>false</code> otherwise
	 */
	@Override
	public boolean isMale() {
		return model.isMale();
	}

	/**
	 * Returns <code>true</code> if this user_ is terms of use.
	 *
	 * @return <code>true</code> if this user_ is terms of use; <code>false</code> otherwise
	 */
	@Override
	public boolean isTermsOfUse() {
		return model.isTermsOfUse();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address1 of this user_.
	 *
	 * @param address1 the address1 of this user_
	 */
	@Override
	public void setAddress1(String address1) {
		model.setAddress1(address1);
	}

	/**
	 * Sets the address2 of this user_.
	 *
	 * @param address2 the address2 of this user_
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the answer of this user_.
	 *
	 * @param answer the answer of this user_
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the birth day of this user_.
	 *
	 * @param birthDay the birth day of this user_
	 */
	@Override
	public void setBirthDay(Date birthDay) {
		model.setBirthDay(birthDay);
	}

	/**
	 * Sets the city of this user_.
	 *
	 * @param city the city of this user_
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this user_.
	 *
	 * @param companyId the company ID of this user_
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the confirm password of this user_.
	 *
	 * @param confirmPassword the confirm password of this user_
	 */
	@Override
	public void setConfirmPassword(String confirmPassword) {
		model.setConfirmPassword(confirmPassword);
	}

	/**
	 * Sets the create date of this user_.
	 *
	 * @param createDate the create date of this user_
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this user_.
	 *
	 * @param emailAddress the email address of this user_
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the first name of this user_.
	 *
	 * @param firstName the first name of this user_
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this user_.
	 *
	 * @param groupId the group ID of this user_
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home phone of this user_.
	 *
	 * @param homePhone the home phone of this user_
	 */
	@Override
	public void setHomePhone(String homePhone) {
		model.setHomePhone(homePhone);
	}

	/**
	 * Sets the last name of this user_.
	 *
	 * @param lastName the last name of this user_
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets whether this user_ is male.
	 *
	 * @param male the male of this user_
	 */
	@Override
	public void setMale(boolean male) {
		model.setMale(male);
	}

	/**
	 * Sets the mobile phone of this user_.
	 *
	 * @param mobilePhone the mobile phone of this user_
	 */
	@Override
	public void setMobilePhone(String mobilePhone) {
		model.setMobilePhone(mobilePhone);
	}

	/**
	 * Sets the modified date of this user_.
	 *
	 * @param modifiedDate the modified date of this user_
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the password of this user_.
	 *
	 * @param password the password of this user_
	 */
	@Override
	public void setPassword(String password) {
		model.setPassword(password);
	}

	/**
	 * Sets the primary key of this user_.
	 *
	 * @param primaryKey the primary key of this user_
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the security question of this user_.
	 *
	 * @param securityQuestion the security question of this user_
	 */
	@Override
	public void setSecurityQuestion(String securityQuestion) {
		model.setSecurityQuestion(securityQuestion);
	}

	/**
	 * Sets the state of this user_.
	 *
	 * @param state the state of this user_
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets whether this user_ is terms of use.
	 *
	 * @param termsOfUse the terms of use of this user_
	 */
	@Override
	public void setTermsOfUse(boolean termsOfUse) {
		model.setTermsOfUse(termsOfUse);
	}

	/**
	 * Sets the user ID of this user_.
	 *
	 * @param userId the user ID of this user_
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this user_.
	 *
	 * @param userName the user name of this user_
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this user_.
	 *
	 * @param userUuid the user uuid of this user_
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user_.
	 *
	 * @param uuid the uuid of this user_
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip code of this user_.
	 *
	 * @param zipCode the zip code of this user_
	 */
	@Override
	public void setZipCode(String zipCode) {
		model.setZipCode(zipCode);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected User_Wrapper wrap(User_ user_) {
		return new User_Wrapper(user_);
	}

}