package com.innova.qualifier;

import javax.enterprise.inject.Default;

@Default // Default olarak ayarladım
public class Mysql implements IDatabase {
	
	@Override
	public String databaseVersion(String database) {
		return "Default Mysql Database";
	}
	
}
