package com.innova.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class EQualifierManager {
	
	/*
	 * @Inject
	 * IDatabase idatabase;
	 */
	
	@Inject
	@EQualifier(EDatabase.MSSQL) // OPSIYONEL
	IDatabase idatabase;
	
	public String getIdatabase() {
		return idatabase.databaseVersion("Database");
	}
	
}
