package com.rentcar.service;

import java.util.List;

import com.rentcar.model.Car;

public interface CarService {
	List<Car> getAllCars();
	
	Car getCarById(Long id);
	
	void addCar(Car car);
	
//	void updateCar(Car car);
	
	void deleteCar(Long id);
}
