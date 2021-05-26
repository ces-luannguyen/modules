<%@ include file="/init.jsp" %>


<h2>Search Results for ${zipCode }</h2>
<liferay-ui:search-container emptyResultsMessage="users-no-found" total="${users_all_count }" delta="5">
	<liferay-ui:search-container-results results="${users_all }">
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.liferay.training.registration.model.User_" keyProperty="eventId" modelVar="user">
		<liferay-ui:search-container-column-text name="First Name" property="firstName" />
		<liferay-ui:search-container-column-text name="Last Name" property="lastName" />
		<liferay-ui:search-container-column-text name="Username" property="userName" />
		<liferay-ui:search-container-column-text name="Email Address" property="emailAddress" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>