package com.example.forecast.model;

public class Props {

	
	String id;
	String type;
	String cwa;
    String forecastOffice;    
	int gridX;
	int gridY;
	String forecast;
	String forecastHourly;
	String forecastGridData;
	String observationStations;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCwa() {
		return cwa;
	}

	public void setCwa(String cwa) {
		this.cwa = cwa;
	}

	public String getForecastOffice() {
		return forecastOffice;
	}

	public void setForecastOffice(String forecastOffice) {
		this.forecastOffice = forecastOffice;
	}

	public int getGridX() {
		return gridX;
	}

	public void setGridX(int gridX) {
		this.gridX = gridX;
	}

	public int getGridY() {
		return gridY;
	}

	public void setGridy(int gridY) {
		this.gridY = gridY;
	}

	public String getForecast() {
		return forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

	public String getForecastHourly() {
		return forecastHourly;
	}

	public void setForecastHourly(String forecastHourly) {
		this.forecastHourly = forecastHourly;
	}

	public String getForecastGridData() {
		return forecastGridData;
	}

	public void setForecastGridData(String forecastGridData) {
		this.forecastGridData = forecastGridData;
	}

	public String getObservationStations() {
		return observationStations;
	}

	public void setObservationStations(String observationStations) {
		this.observationStations = observationStations;
	}

	public Props() {
		super();
	
	}
	
	

	
}
