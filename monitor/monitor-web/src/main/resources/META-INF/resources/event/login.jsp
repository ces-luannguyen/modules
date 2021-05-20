<liferay-ui:search-container  deltaConfigurable="true" emptyResultsMessage="no-events-found" delta="${delta }" total="${events_log_count }">
 <liferay-ui:search-container-results results="${events_log }" >
 </liferay-ui:search-container-results>
 
 <liferay-ui:search-container-row className="com.liferay.training.monitor.model.Event" modelVar="event" keyProperty="eventId" > 
 <liferay-ui:search-container-column-date property="eventDate" name="Event Date Time"></liferay-ui:search-container-column-date>
 <liferay-ui:search-container-column-text property="userName" name="User Name" /> 
 <liferay-ui:search-container-column-text property="userId" name="User Id" /> 
 <liferay-ui:search-container-column-text property="ipAddress" name="IP Address" /> 
 <liferay-ui:search-container-column-text property="eventType" name="Event Type" /> 
 </liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>