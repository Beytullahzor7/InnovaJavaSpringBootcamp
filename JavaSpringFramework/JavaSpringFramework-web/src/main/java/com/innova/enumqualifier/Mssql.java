package com.innova.enumqualifier;

@EQualifier(EDatabase.MSSQL)
public class Mssql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Opsiyonel Mssql Database";
	}
	
}
