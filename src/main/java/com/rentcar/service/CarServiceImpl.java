package com.rentcar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rentcar.dao.CarDaoImpl;
import com.rentcar.model.Car;

@Service
public class CarServiceImpl implements CarService{

	private CarDaoImpl carDao;
	
	@Override
	public List<Car> getAllCars() {
		return carDao.getAllCars();
	}

	@Override
	public Car getCarById(Long id) {
		Car obj = carDao.getCarById(id);
		return obj;
	}

	@Override
	public void addCar(Car car) {
		carDao.save(car);
	}

	/*@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void deleteCar(Long id) {
		carDao.delete(id);
	}

}
