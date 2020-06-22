package com.test.observerPattern;

public class WeatherStation2 {
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 39.2f);
		
		WeatherData2 weatherData2 = new WeatherData2();
		
		CurrentConditionsDisplay2 currentDisplay2 = new CurrentConditionsDisplay2(weatherData2);
		
		weatherData2.setMeasurements(10, 20, 20.4f);
		
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData2);
		
		weatherData2.setMeasurements(10, 20, 20.4f); 
				
						
	}
}
