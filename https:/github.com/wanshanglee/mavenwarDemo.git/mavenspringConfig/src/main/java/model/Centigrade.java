package model;

public class Centigrade implements Temperature{

	public Double convertTemperature(Double temp) {
		return (temp - 32)*5/9;
	}

}



