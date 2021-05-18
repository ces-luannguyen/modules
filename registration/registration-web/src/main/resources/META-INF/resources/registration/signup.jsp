<%@ include file="/init.jsp" %>
<liferay-ui:success key="userAdded" message="user-added-successfully" />

<liferay-ui:error key="serviceErrorDetails">
     <liferay-ui:message key="error.user-service-error" arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>' />
</liferay-ui:error>
<liferay-ui:error key="firstNameEmpty" message="error.firstname-empty" />
<liferay-ui:error key="firstNameAlphaNumeric" message="error.firstname-alpha-numeric" />
<liferay-ui:error key="firstNameMax50" message="error.firstname-max50" />
<liferay-ui:error key="lastNameEmpty" message="error.lastname-empty" />
<liferay-ui:error key="lastNameAlphaNumeric" message="error.lastname-alpha-numeric" />
<liferay-ui:error key="lastNameMax50" message="error.lastname-max50" />
<liferay-ui:error key="emailAddressEmpty" message="error.email-empty" />
<liferay-ui:error key="emailAddressFormat" message="error.email-wrong-format" />
<liferay-ui:error key="emailAddressMax255" message="error.email-max255" />

<liferay-ui:error key="userNameEmpty" message="error.username-empty" />
<liferay-ui:error key="userNameAlphaNumeric" message="error.username-alpha-numeric" />
<liferay-ui:error key="userNameMax16" message="error.username-max16" />
<liferay-ui:error key="userNameMin4" message="error.username-min4" />
<liferay-ui:error key="userNameExist" message="error.username-exist" />



<liferay-ui:error key="passwordEmpty" message="error.password-empty" />
<liferay-ui:error key="passwordFormat" message="error.password-format" />
<liferay-ui:error key="passwordMin6" message="error.password-min6" />
<liferay-ui:error key="confirmPasswordEmpty" message="error.confirmpassword-empty" />
<liferay-ui:error key="passwordNotMatch" message="error.password-not-match" />
<liferay-ui:error key="homePhoneDigit" message="error.homephone-digit" />
<liferay-ui:error key="homePhone10" message="error.homephone-10-digit" />
<liferay-ui:error key="mobilePhoneDigit" message="error.mobilephone-digit" />
<liferay-ui:error key="mobilePhone10" message="error.mobilephone-10-digit" />

<liferay-ui:error key="address1Empty" message="error.address1-empty" />
<liferay-ui:error key="address1AlphaNumeric" message="error.address1-alpha-numeric" />
<liferay-ui:error key="address1Max255" message="error.address1-max255" />

<liferay-ui:error key="address2AlphaNumeric" message="error.address2-alpha-numeric" />
<liferay-ui:error key="address2Max255" message="error.address2-max255" />

<liferay-ui:error key="cityEmpty" message="error.city-empty" />
<liferay-ui:error key="cityAlphaNumeric" message="error.city-alpha-numeric" />
<liferay-ui:error key="cityMax255" message="error.city-max255" />

<liferay-ui:error key="stateEmpty" message="error.state-empty" />

<liferay-ui:error key="zipCodeEmpty" message="error.zipcode-empty" />
<liferay-ui:error key="zipCodeDigit" message="error.zipcode-digit" />
<liferay-ui:error key="zipCode5" message="error.zipcode-5-digit" />

<liferay-ui:error key="securityQuestionEmpty" message="error.security-question-empty" />

<liferay-ui:error key="answerEmpty" message="error.answer-empty" />
<liferay-ui:error key="answerAlphaNumeric" message="error.answer-alpha-numeric" />
<liferay-ui:error key="answerMax255" message="error.answer-max255" />

<liferay-ui:error key="touChecked" message="error.tou-checked" />

<portlet:actionURL name="<%= MVCCommandNames.ADD_USER %>" var="userActionURL">
	<portlet:param name="redirect" value="${param.redirect}" />
</portlet:actionURL>

<div class="container-fluid-1280 edit-assignment">

	<aui:form action="${userActionURL}" name="fm">
		<h1><liferay-ui:message key="basic-info" /></h3>

		<aui:input field="userId" name="userId" type="hidden" />

		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset>

				<%-- First name field. --%>

				<aui:input label="first-name" name="first_name">
					<aui:validator name="required" />
					<aui:validator name="alphanum" />
                    <aui:validator name="maxLength">50</aui:validator>
				</aui:input>

				<%-- Last name field. --%>

				<aui:input label="last-name" name="last_name">
					<aui:validator name="required" />
					<aui:validator name="alphanum" />
                    <aui:validator name="maxLength">50</aui:validator>
				</aui:input>

				<%-- Email address field. --%>

				<aui:input label="email-address" name="email_address">
					<aui:validator name="required" />
					<aui:validator name="email" />
                    <aui:validator name="maxLength">50</aui:validator>
				</aui:input>

				<%-- Username field. --%>

				<aui:input label="username" name="username">
					<aui:validator name="required" />
					<aui:validator name="alphanum" />
                    <aui:validator name="rangeLength">[4,16]</aui:validator>
				</aui:input>

				<%-- Male checkbox field. --%>

				<aui:input label="male" name="male" type="checkbox">
				</aui:input>


				<%-- Birthday field. --%>
				<aui:fieldset label="Birthday">
				</aui:fieldset>

				<liferay-ui:input-date
					dayParam="b_day"
					dayValue="21"
					formName="birthday"
					monthParam="b_month"
					monthValue="3"
					yearParam="b_year"
					yearValue="2010"
					required="true"
				/>

				
				<%-- Password field. --%>
				<aui:input label="password" name="password1" type="password">
					<aui:validator errorMessage="At least one uppercase, one digit, one special character specified." name="custom">
		                function(val, fieldNode, ruleValue) {
		                        var regex = new RegExp(/(?=.*\d)(?=.*[A-Z])(?=.*\W)/i);
		
		                        return regex.test(val);
		                }
        			</aui:validator>
        			<aui:validator name="minLength">6</aui:validator>
					<aui:validator name="required" />
				</aui:input>


				<%-- Confirm password field. --%>
				<aui:input label="confirm-password" name="password2" type="password">
					<aui:validator name="required" />
				</aui:input>

				</aui:fieldset>
				</aui:fieldset-group>

		<h1><liferay-ui:message key="phone" /></h3>

		<aui:fieldset-group markupView="lexicon">

			<aui:fieldset>

				<%-- Homephone field. --%>
				<aui:input label="home-phone" name="home_phone">
					<aui:validator name="digits" />
					<aui:validator errorMessage="Only number with 10 digits is allowed." name="custom">
		                function(val, fieldNode, ruleValue) {
		                        var regex = new RegExp(/^.{10}$/i);
		
		                        return regex.test(val);
		                }
        			</aui:validator>
				</aui:input>

				<%-- Mobilephone field. --%>
				<aui:input label="mobile-phone" name="mobile_phone">
					<aui:validator name="digits" />
					<aui:validator errorMessage="Only number with 10 digits is allowed." name="custom">
		                function(val, fieldNode, ruleValue) {
		                        var regex = new RegExp(/^.{10}$/i);
		
		                        return regex.test(val);
		                }
        			</aui:validator>
				</aui:input>

			</aui:fieldset>
		</aui:fieldset-group>

		<h1><liferay-ui:message key="billing-address" /></h3>

		<aui:fieldset-group markupView="lexicon">

			<aui:fieldset>

				<%-- Address1 field. --%>

				<aui:input label="address-1" name="address">
					<aui:validator name="required" />
					<aui:validator name="alphanum" />
                    <aui:validator name="maxLength">255</aui:validator>
				</aui:input>

				<%-- Address2 field. --%>

				<aui:input label="address-2" name="address2">
					<aui:validator name="alphanum" />
                    <aui:validator name="maxLength">255</aui:validator>
				</aui:input>

				<%-- City field. --%>
				<aui:input label="city" name="city">
					<aui:validator name="required" />
					<aui:validator name="alphanum" />
                    <aui:validator name="maxLength">255</aui:validator>
				</aui:input>
				
				<%-- State field. --%>
				<aui:input label="state" name="state">
					<aui:validator name="required" />
				</aui:input>


				<%-- Zipcode field. --%>
				<aui:input label="zip-code" name="zip">
					<aui:validator name="digits" />
					<aui:validator errorMessage="Only number with 5 digits is allowed." name="custom">
		                function(val, fieldNode, ruleValue) {
		                        var regex = new RegExp(/^.{5}$/i);
		
		                        return regex.test(val);
		                }
        			</aui:validator>
        			<aui:validator name="required" />
				</aui:input>

			</aui:fieldset>
		</aui:fieldset-group>

		<h1><liferay-ui:message key="misc." /></h3>

		<aui:fieldset-group markupView="lexicon">

			<aui:fieldset>

				<%-- Security question --%>

				<aui:select id="options" label="security-question" name="security_question" required="true" showEmptyOption="true">
					<aui:option value="What is your mother's maiden name?">What is your mother's maiden name?</aui:option>
					<aui:option value="What is the make of your first car?">What is the make of your first car?</aui:option>
					<aui:option value="What is your high school mascot?">What is your high school mascot?</aui:option>
					<aui:option value="Who is your favorite actor?">Who is your favorite actor?</aui:option>
				</aui:select>

				<%-- Answer field. --%>

				<aui:input label="answer" name="security_answer">
					<aui:validator name="required" />
					<aui:validator name="alphanum" />
                    <aui:validator name="maxLength">255</aui:validator>
				</aui:input>

				<aui:fieldset label="Terms Of Use">
				</aui:fieldset>
				
				<%-- Terms of use field. --%>
				<aui:input label="terms-of-use" name="accepted_tou" type="checkbox">
				</aui:input>

			</aui:fieldset>
		</aui:fieldset-group>

		<%--Buttons. --%>

		<aui:button-row>
			<aui:button cssClass="btn btn-primary" type="submit" />
			<aui:button cssClass="btn btn-secondary" onClick="${param.redirect}" type="cancel" />
		</aui:button-row>
	</aui:form>
</div>