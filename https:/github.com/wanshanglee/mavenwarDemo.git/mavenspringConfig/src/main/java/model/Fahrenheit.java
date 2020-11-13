package model;

public class Fahrenheit implements Temperature{

	public Double convertTemperature(Double temp) {
		return (temp - 32)*5/9;
	}

}



