<%@ include file="/init.jsp" %>

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
				</aui:input>

				<%-- Last name field. --%>

				<aui:input label="last-name" name="last_name">
					<aui:validator name="required" />
				</aui:input>

				<%-- Email address field. --%>

				<aui:input label="email-address" name="email_address">
					<aui:validator name="required" />
				</aui:input>

				<%-- Username field. --%>

				<aui:input label="username" name="username">
					<aui:validator name="required" />
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
				</aui:input>

				<%-- Mobilephone field. --%>
				<aui:input label="mobile-phone" name="mobile_phone">
				</aui:input>

			</aui:fieldset>
		</aui:fieldset-group>

		<h1><liferay-ui:message key="billing-address" /></h3>

		<aui:fieldset-group markupView="lexicon">

			<aui:fieldset>

				<%-- Address1 field. --%>

				<aui:input label="address-1" name="address">
					<aui:validator name="required" />
				</aui:input>

				<%-- Address2 field. --%>

				<aui:input label="address-2" name="address2">
				</aui:input>

				<%-- City field. --%>
				<aui:input label="city" name="city">
					<aui:validator name="required" />
				</aui:input>
				
				<%-- State field. --%>
				<aui:input label="state" name="state">
					<aui:validator name="required" />
				</aui:input>


				<%-- Zipcode field. --%>
				<aui:input label="zip-code" name="zip">
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