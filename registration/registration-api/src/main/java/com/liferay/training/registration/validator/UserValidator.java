package com.liferay.training.registration.validator;

import com.liferay.training.registration.exception.UserValidationException;

import java.util.Date;

public interface UserValidator {

	public void validate(
			String userName, String firstName, String lastName,
			String emailAddress, Date birthDay, String password,
			String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, String securityQuestion, String answer,
			boolean termsOfUse)
		throws UserValidationException;

}