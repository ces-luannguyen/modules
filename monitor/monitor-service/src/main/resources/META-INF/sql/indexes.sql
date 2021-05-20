create index IX_7C4B3F8D on Monitor_Event (companyId);
create index IX_A2FB0F09 on Monitor_Event (eventType[$COLUMN_LENGTH:75$]);
create index IX_25B79AEF on Monitor_Event (uuid_[$COLUMN_LENGTH:75$], companyId);