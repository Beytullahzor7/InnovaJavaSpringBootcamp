package com.innova.qualifier;

@QualifierCokluSecim
public class Postgresql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Opsiyonel Postgresql Database";
	}
	
}
