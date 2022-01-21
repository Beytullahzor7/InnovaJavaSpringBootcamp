package com.innova.stereotype;

@InnovaMultipleAnotation
// Çoklu anotasyon yapısını teke indirdik.
public class DatabaseBean {
	
	private String database = "PostgreSql";
	
	public String getDatabase() {
		return database;
	}
	
	public void setDatabase(String database) {
		this.database = database;
	}
}
