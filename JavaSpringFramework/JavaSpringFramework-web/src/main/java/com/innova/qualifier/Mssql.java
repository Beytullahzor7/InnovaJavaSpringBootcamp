package com.innova.qualifier;

@QualifierCokluSecim
public class Mssql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Opsiyonel Mssql Database";
	}
	
}
