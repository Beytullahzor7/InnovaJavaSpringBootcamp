package com.innova.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class DatabaseManager {
	
	@Inject
	private IDatabase idatabase;
	
	public String getIdatabase() {
		return idatabase.databaseVersion("Database");
	}
	
}
