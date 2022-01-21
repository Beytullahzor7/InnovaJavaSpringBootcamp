package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Postgresql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Postgresql Database";
	}
	
}
