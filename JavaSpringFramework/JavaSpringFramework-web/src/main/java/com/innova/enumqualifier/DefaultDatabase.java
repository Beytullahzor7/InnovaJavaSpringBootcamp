package com.innova.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabase implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Default Database PostgreSql";
	}
	
}
