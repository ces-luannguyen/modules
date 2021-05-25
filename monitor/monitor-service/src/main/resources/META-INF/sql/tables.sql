create table Monitor_Event (
	uuid_ VARCHAR(75) null,
	eventId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userName VARCHAR(75) null,
	userId LONG,
	eventDate DATE null,
	eventType VARCHAR(75) null,
	ipAddress VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);