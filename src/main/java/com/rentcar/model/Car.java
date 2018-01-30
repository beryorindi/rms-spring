package com.rentcar.model;


public class Car {
	String brand;
	String type;
	String model;
	String transmition;
	int seat;
	int year;

	public Car(String transmition, String type, String brand, int year, String model, int seat) {
		this.transmition = transmition;
		this.type = type;
		this.brand = brand;
		this.year = year;
		this.model = model;
		this.seat = seat;
	}
	public String getTransmition() {
		return transmition;
	}
	public void setTransmition(String transmition) {
		this.transmition = transmition;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
}
