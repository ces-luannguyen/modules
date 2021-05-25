create index IX_7C4B3F8D on Monitor_Event (companyId);
create index IX_A2FB0F09 on Monitor_Event (eventType[$COLUMN_LENGTH:75$]);
create index IX_46C8454F on Monitor_Event (groupId);
create index IX_A3CAF98F on Monitor_Event (userId, eventType[$COLUMN_LENGTH:75$]);
create index IX_25B79AEF on Monitor_Event (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BCF81131 on Monitor_Event (uuid_[$COLUMN_LENGTH:75$], groupId);