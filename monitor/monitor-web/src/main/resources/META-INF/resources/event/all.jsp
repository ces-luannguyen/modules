<liferay-ui:search-container emptyResultsMessage="No user events" total="${events_all_count}">
 <liferay-ui:search-container-results results="${events_all }" >
 </liferay-ui:search-container-results>
 
 <liferay-ui:search-container-row className="com.liferay.training.monitor.model.Event" modelVar="event" keyProperty="eventId" > 
 <liferay-ui:search-container-column-text name="Event Date"
			value="<%=formatter.format(event.getEventDate()) %>" />
 <liferay-ui:search-container-column-text property="userName" name="User Name" /> 
 <liferay-ui:search-container-column-text property="userId" name="User Id" /> 
 <liferay-ui:search-container-column-text property="ipAddress" name="IP Address" /> 
 <liferay-ui:search-container-column-text property="eventType" name="Event Type" /> 
 </liferay-ui:search-container-row>
 <liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>