package com.innova.enumqualifier;

@EQualifier(EDatabase.MYSQL)
public class Mysql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Opsiyonel Mysql Database";
	}
	
}
