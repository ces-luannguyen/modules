<liferay-ui:search-container emptyResultsMessage="No user events" total="${events_all_count}">
	<liferay-ui:search-container-results results="${events_all }">
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.liferay.training.monitor.model.Event" keyProperty="eventId" modelVar="event">
		<liferay-ui:search-container-column-text
			name="Event Date"
			value="<%= formatter.format(event.getEventDate()) %>"
		/>

		<liferay-ui:search-container-column-text name="User Name" property="userName" />
		<liferay-ui:search-container-column-text name="User Id" property="userId" />
		<liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
		<liferay-ui:search-container-column-text name="Event Type" property="eventType" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>