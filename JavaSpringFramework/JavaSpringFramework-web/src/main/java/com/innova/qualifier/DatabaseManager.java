package com.innova.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCDI")
@ApplicationScoped
public class DatabaseManager implements Serializable {
	private static final long serialVersionUID = 8186667108557464483L;
	
	@Inject
	private IDatabase idatabase;
	
	public String getIdatabase() {
		return idatabase.databaseVersion("Database");
	}
	
}
