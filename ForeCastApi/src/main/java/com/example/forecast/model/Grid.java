package com.example.forecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Grid {
	Props properties = new Props();
	
	
	
	public Props getProperties() {
		return properties;
	}



	public void setProperties(Props properties) {
		this.properties = properties;
	}



	public Grid() {
		super();
	}

	
}
