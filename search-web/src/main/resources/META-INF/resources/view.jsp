<%@page import="com.liferay.training.search.web.constants.MVCCommandNames"%>
<%@ include file="/init.jsp" %>

<liferay-ui:error key="zipCode5" message="error.zipcode-5-digit" />
<liferay-ui:error key="no-permission" message="error.no-permission" />
<portlet:actionURL name="<%= MVCCommandNames.SEARCH_ZIPCODE %>" var="searchActionURL">
	<portlet:param name="redirect" value="${param.redirect}" />
</portlet:actionURL>

<div class="container-fluid-1280 edit-assignment">
	<aui:form action="${searchActionURL}" name="fm">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset>
				<%-- Zipcode field. --%>
				<aui:input label="zip-code" name="zip" value="${zipCode }">
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


		

		<%--Buttons. --%>

		<aui:button-row>
			<aui:button cssClass="btn btn-primary" type="submit" value="Search"/>
		</aui:button-row>
	</aui:form>
</div>