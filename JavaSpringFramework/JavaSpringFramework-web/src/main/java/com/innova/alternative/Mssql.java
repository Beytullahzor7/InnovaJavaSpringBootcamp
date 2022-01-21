package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mssql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Mssql Database";
	}
	
}
