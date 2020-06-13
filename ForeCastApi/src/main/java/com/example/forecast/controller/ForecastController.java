package com.example.forecast.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.forecast.model.Forecastobj;
import com.example.forecast.model.Grid;
import com.example.forecast.model.Period;
import com.example.forecast.model.Prop;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@RestController
public class ForecastController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/string")
	public String getString() {
		return "Hello Swetha";
	}
   @GetMapping("/getPoint/{latitude},{longitude}")
   public String getPoint(@PathVariable String latitude,@PathVariable String longitude ) {
	   
	   //https://api.weather.gov/points/39.7456,-97.0892
	  String url = "https://api.weather.gov/points/" + latitude + "," + longitude;
	 
	Grid grid = restTemplate.getForObject(url, Grid.class);
	
	  System.out.println("id: " + grid.getProperties().getCwa());
	   System.out.println("Gridx : "+ grid.getProperties().getGridX());
	   System.out.println("Gridy: "+ grid.getProperties().getGridY());
		
		  String cwa = grid.getProperties().getCwa();
		  int gridX = grid.getProperties().getGridX();
		  int gridY =  grid.getProperties().getGridY();
		 
	    
		
		  //https://api.weather.gov/gridpoints/{office}/{grid X},{grid Y}/forecast
		  String forecasturl = "https://api.weather.gov/gridpoints/" + cwa + "/" + gridX + "," + gridY + "/forecast";
		  Forecastobj forcastobj = restTemplate.getForObject("https://api.weather.gov/gridpoints/TOP/31,80/forecast", Forecastobj.class);
		  Prop properties = forcastobj.getProperties();
		  Period[]  periodlist = properties.getPeriods();
		System.out.println("Periodlist size: " +periodlist.length );
		//System.out.println("Periodlist size: " +periodlist[0].toString());
		for(int i=0;i<10;i++) {
			System.out.println("Periodlist size: " +periodlist[i].toString());
		}
	return latitude + " " + longitude;
	   
   }
   
   
}
