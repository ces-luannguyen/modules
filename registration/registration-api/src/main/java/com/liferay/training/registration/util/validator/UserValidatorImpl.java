package com.liferay.training.registration.util.validator;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.registration.exception.UserValidationException;
import com.liferay.training.registration.service.User_Service;
import com.liferay.training.registration.service.persistence.User_Util;
import com.liferay.training.registration.validator.UserValidator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	     immediate = true, 
	     service = UserValidator.class
	 )
	 public class UserValidatorImpl implements UserValidator {

	     /**
	      * Validates user values and throws
	      * {UserValidationException} exception if the user values are not
	      * valid.
	      * 
	      * @param userName
	      * @param firstName
	      * @param lastName
	      * @param emailAddress
	      * @param birthDay
	      * @param password
	      * @param confirmPassword
	      * @param homePhone
	      * @param mobilePhone
	      * @param address1
	      * @param address2
	      * @param city
	      * @param state
	      * @param zipCode
	      * @param securityQuestion
	      * @param answer
	      * @param termsOfUse
	      * @throws AssignmentValidationExceptionException
	      */
	     public void validate(
	    		 String userName, String firstName, String lastName, String emailAddress,
			     Date birthDay, String password, String confirmPassword, String homePhone, String mobilePhone,
			     String address1, String address2, String city, String state, String zipCode, String securityQuestion,
			     String answer, boolean termsOfUse)
	         throws UserValidationException {

	         List<String> errors = new ArrayList<>();

	         if (!isAssignmentValid(userName, firstName, lastName, emailAddress, birthDay, password, confirmPassword, homePhone, mobilePhone, address1, address2, city, state, zipCode, securityQuestion, answer, termsOfUse, errors)) {
	             throw new UserValidationException(errors);
	         }
	     }

	     /**
	      * Returns <code>true</code> if the given fields are valid for an
	      * user.
	      * 
	      * @param userName
	      * @param firstName
	      * @param lastName
	      * @param emailAddress
	      * @param birthDay
	      * @param password
	      * @param confirmPassword
	      * @param homePhone
	      * @param mobilePhone
	      * @param address1
	      * @param address2
	      * @param city
	      * @param state
	      * @param zipCode
	      * @param securityQuestion
	      * @param answer
	      * @param termsOfUse
	      * @param errors
	      * @return boolean <code>true</code> if user is valid, otherwise
	      *         <code>false</code>
	      */
	     private boolean isAssignmentValid(
	    		 final String userName, final String firstName, final String lastName, final String emailAddress,
			     final Date birthDay, final String password, final String confirmPassword, final String homePhone, final String mobilePhone,
			     final String address1, final String address2, final String city, final String state, final String zipCode, final String securityQuestion,
			     final String answer, boolean termsOfUse, final List<String> errors) {

	         boolean result = true;

	         result &= isFirstNameValid(firstName, errors);
	         result &= isLastNameValid(lastName, errors);
	         result &= isEmailValid(emailAddress, errors);
	         result &= isUsernameValid(userName, errors);
	         result &= isPasswordValid(password, errors);
	         result &= isConfirmPasswordValid(password, confirmPassword, errors);
	         result &= isHomePhoneValid(homePhone, errors);
	         result &= isMobilePhoneValid(mobilePhone, errors);
	         result &= isAddress1Valid(address1, errors);
	         result &= isAddress2Valid(address2, errors);
	         result &= isCityValid(city, errors);
	         result &= isStateValid(state, errors);
	         result &= isZipCodeValid(zipCode, errors);
	         result &= isSecurityQuestionValid(securityQuestion, errors);
	         result &= isAnswerValid(answer, errors);
	         result &= isTermsOfUseValid(termsOfUse, errors);
	         return result;
	     }

	     
			private boolean isFirstNameValid(final String firstName, final List<String> errors) {
		
				boolean result = true;
		
				if (Validator.isNull(firstName)) {
					errors.add("firstNameEmpty");
					result = false;
				} else {
					if (!Validator.isAlphanumericName(firstName)) {
						errors.add("firstNameAlphaNumeric");
						result = false;
					}
					if (firstName.length() > 50) {
						errors.add("firstNameMax50");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isLastNameValid(final String lastName, final List<String> errors) {
		
				boolean result = true;
		
				if (Validator.isNull(lastName)) {
					errors.add("lastNameEmpty");
					result = false;
				} else {
					if (!Validator.isAlphanumericName(lastName)) {
						errors.add("lastNameAlphaNumeric");
						result = false;
					}
					if (lastName.length() > 50) {
						errors.add("lastNameMax50");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isEmailValid(final String emailAddress, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(emailAddress)) {
					errors.add("emailAddressEmpty");
					result = false;
				} else {
					if (!Validator.isEmailAddress(emailAddress)) {
						// TODO
						errors.add("emailAddressFormat");
						result = false;
					}
					if (emailAddress.length() > 255) {
						errors.add("emailAddressMax255");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isUsernameValid(final String userName, final List<String> errors) {
				boolean result = true;
		
				if (Validator.isNull(userName)) {
					errors.add("userNameEmpty");
					result = false;
				} else {
					if (!Validator.isAlphanumericName(userName)) {
						errors.add("userNameAlphaNumeric");
						result = false;
					}
					if (userName.length() > 16) {
						errors.add("userNameMax16");
						result = false;
					}
					
					if (userName.length() < 4) {
						errors.add("userNameMin4");
						result = false;
					}
					
					if (User_Util.findByUserName(userName).size()>0) {
						errors.add("userNameExist");
						result = false;
					}
						
					
				}
				return result;
			}
			
			private boolean isPasswordValid(final String password, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(password)) {
					errors.add("passwordEmpty");
					result = false;
				} else {
					// TODO
					String PASSWORD_PATTERN =
				            "^(?=.*\\d)(?=.*[A-Z])(?=.*\\W).{0,}$";

					Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		
					Matcher matcher = pattern.matcher(password);
					if (!matcher.matches()) {
						errors.add("passwordFormat");
						result = false;
					}

					if (password.length() < 6) {
						errors.add("passwordMin6");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isConfirmPasswordValid(final String password, final String confirmPassword, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(confirmPassword)) {
					errors.add("confirmPasswordEmpty");
					result = false;
				} else {
					if (!password.equals(confirmPassword)) {
					errors.add("passwordNotMatch");
					result = false;
				
				
					}
				}
				return result;
			}
			
			private boolean isHomePhoneValid(final String homePhone, final List<String> errors) {
				
				boolean result = true;
		
				if (!Validator.isNull(homePhone)) {
					if (!Validator.isDigit(homePhone)) {
						errors.add("homePhoneDigit");
						result = false;
		
					}
					if (homePhone.length() != 10) {
						errors.add("homePhone10");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isMobilePhoneValid(final String mobilePhone, final List<String> errors) {
				
				boolean result = true;
		
				if (!Validator.isNull(mobilePhone)) {
					if (!Validator.isDigit(mobilePhone)) {
						errors.add("mobilePhoneDigit");
						result = false;
		
					}
					if (mobilePhone.length() != 10) {
						errors.add("mobilePhone10");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isAddress1Valid(final String address1, final List<String> errors) {
				
				boolean result = true;
		
				
				if (Validator.isNull(address1)) {
					errors.add("address1Empty");
					result = false;
				} else {
					if (!Validator.isAlphanumericName(address1)) {
						errors.add("address1AlphaNumeric");
						result = false;
					}
					if (address1.length() > 255) {
						errors.add("address1Max255");
						result = false;
					}
				}
				
				return result;
			}
			
			private boolean isAddress2Valid(final String address2, final List<String> errors) {
				
				boolean result = true;
		
				if (!Validator.isNull(address2)) {
					if (!Validator.isAlphanumericName(address2)) {
						errors.add("address2AlphaNumeric");
						result = false;
					}
					if (address2.length() > 255) {
						errors.add("address2Max255");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isCityValid(final String city, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(city)) {
					errors.add("cityEmpty");
					result = false;
				} else {
					if (!Validator.isAlphanumericName(city)) {
						errors.add("cityAlphaNumeric");
						result = false;
					}
					if (city.length() > 255) {
						errors.add("cityMax255");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isStateValid(final String state, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(state)) {
					errors.add("stateEmpty");
					result = false;
				} else {
					// TODO
					
					
				}
				return result;
			}
			
			private boolean isZipCodeValid(final String zipCode, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(zipCode)) {
					errors.add("zipCodeEmpty");
					result = false;
				} else {
					if (!Validator.isDigit(zipCode)) {
						errors.add("zipCodeDigit");
						result = false;
					}
					if (zipCode.length() != 5) {
						errors.add("zipCode5");
						result = false;
					}
					
				}
				return result;
			}
			
			private boolean isSecurityQuestionValid(final String securityQuestion, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(securityQuestion)) {
					errors.add("securityQuestionEmpty");
					result = false;
				} 
				return result;
			}
			
			private boolean isAnswerValid(final String answer, final List<String> errors) {
				
				boolean result = true;
		
				if (Validator.isNull(answer)) {
					errors.add("answerEmpty");
					result = false;
				} else {
					if (!Validator.isAlphanumericName(answer)) {
						errors.add("answerAlphaNumeric");
						result = false;
					}
					if (answer.length() > 255) {
						errors.add("answerMax255");
						result = false;
					}
				}
				return result;
			}
			
			private boolean isTermsOfUseValid(final boolean termsOfUse, final List<String> errors) {
				
				boolean result = true;
		
				if (termsOfUse==false) {
					errors.add("touChecked");
					result = false;
				}
				return result;
				
				
			}
	     
			
	 }
