create index IX_1129B89E on Registration_User_ (userName[$COLUMN_LENGTH:75$]);
create index IX_EDDF1428 on Registration_User_ (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A8EE84AA on Registration_User_ (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_8699FAA on Registration_User_ (zipCode[$COLUMN_LENGTH:75$]);