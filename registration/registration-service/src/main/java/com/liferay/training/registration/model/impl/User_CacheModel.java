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

package com.liferay.training.registration.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.registration.model.User_;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing User_ in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class User_CacheModel implements CacheModel<User_>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof User_CacheModel)) {
			return false;
		}

		User_CacheModel user_CacheModel = (User_CacheModel)obj;

		if (userId == user_CacheModel.userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", male=");
		sb.append(male);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", password=");
		sb.append(password);
		sb.append(", confirmPassword=");
		sb.append(confirmPassword);
		sb.append(", homePhone=");
		sb.append(homePhone);
		sb.append(", mobilePhone=");
		sb.append(mobilePhone);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append(", securityQuestion=");
		sb.append(securityQuestion);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", termsOfUse=");
		sb.append(termsOfUse);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public User_ toEntityModel() {
		User_Impl user_Impl = new User_Impl();

		if (uuid == null) {
			user_Impl.setUuid("");
		}
		else {
			user_Impl.setUuid(uuid);
		}

		user_Impl.setUserId(userId);
		user_Impl.setCompanyId(companyId);
		user_Impl.setGroupId(groupId);

		if (userName == null) {
			user_Impl.setUserName("");
		}
		else {
			user_Impl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			user_Impl.setCreateDate(null);
		}
		else {
			user_Impl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			user_Impl.setModifiedDate(null);
		}
		else {
			user_Impl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			user_Impl.setFirstName("");
		}
		else {
			user_Impl.setFirstName(firstName);
		}

		if (lastName == null) {
			user_Impl.setLastName("");
		}
		else {
			user_Impl.setLastName(lastName);
		}

		if (emailAddress == null) {
			user_Impl.setEmailAddress("");
		}
		else {
			user_Impl.setEmailAddress(emailAddress);
		}

		user_Impl.setMale(male);

		if (birthDay == Long.MIN_VALUE) {
			user_Impl.setBirthDay(null);
		}
		else {
			user_Impl.setBirthDay(new Date(birthDay));
		}

		if (password == null) {
			user_Impl.setPassword("");
		}
		else {
			user_Impl.setPassword(password);
		}

		if (confirmPassword == null) {
			user_Impl.setConfirmPassword("");
		}
		else {
			user_Impl.setConfirmPassword(confirmPassword);
		}

		if (homePhone == null) {
			user_Impl.setHomePhone("");
		}
		else {
			user_Impl.setHomePhone(homePhone);
		}

		if (mobilePhone == null) {
			user_Impl.setMobilePhone("");
		}
		else {
			user_Impl.setMobilePhone(mobilePhone);
		}

		if (address1 == null) {
			user_Impl.setAddress1("");
		}
		else {
			user_Impl.setAddress1(address1);
		}

		if (address2 == null) {
			user_Impl.setAddress2("");
		}
		else {
			user_Impl.setAddress2(address2);
		}

		if (city == null) {
			user_Impl.setCity("");
		}
		else {
			user_Impl.setCity(city);
		}

		if (state == null) {
			user_Impl.setState("");
		}
		else {
			user_Impl.setState(state);
		}

		if (zipCode == null) {
			user_Impl.setZipCode("");
		}
		else {
			user_Impl.setZipCode(zipCode);
		}

		if (securityQuestion == null) {
			user_Impl.setSecurityQuestion("");
		}
		else {
			user_Impl.setSecurityQuestion(securityQuestion);
		}

		if (answer == null) {
			user_Impl.setAnswer("");
		}
		else {
			user_Impl.setAnswer(answer);
		}

		user_Impl.setTermsOfUse(termsOfUse);

		user_Impl.resetOriginalValues();

		return user_Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		male = objectInput.readBoolean();
		birthDay = objectInput.readLong();
		password = objectInput.readUTF();
		confirmPassword = objectInput.readUTF();
		homePhone = objectInput.readUTF();
		mobilePhone = objectInput.readUTF();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zipCode = objectInput.readUTF();
		securityQuestion = objectInput.readUTF();
		answer = objectInput.readUTF();

		termsOfUse = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeBoolean(male);
		objectOutput.writeLong(birthDay);

		if (password == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (confirmPassword == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(confirmPassword);
		}

		if (homePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homePhone);
		}

		if (mobilePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobilePhone);
		}

		if (address1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}

		if (securityQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityQuestion);
		}

		if (answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answer);
		}

		objectOutput.writeBoolean(termsOfUse);
	}

	public String uuid;
	public long userId;
	public long companyId;
	public long groupId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String emailAddress;
	public boolean male;
	public long birthDay;
	public String password;
	public String confirmPassword;
	public String homePhone;
	public String mobilePhone;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zipCode;
	public String securityQuestion;
	public String answer;
	public boolean termsOfUse;

}