package com.test.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.printf("Changed conditions :  %f N -> %f N \n",lastPressure,currentPressure);		
	}

	@Override
	public void update(Observable obs, Object arg) {
		
		WeatherData2 weatherData2 = (WeatherData2)observable;

		if(obs instanceof WeatherData2) {
			lastPressure = currentPressure;
			currentPressure = weatherData2.getPressure();
			display();
		}
	}
	
	

}
