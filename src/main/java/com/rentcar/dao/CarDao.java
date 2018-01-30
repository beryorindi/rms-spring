package com.rentcar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.rentcar.model.Car;

public interface CarDao extends Repository<Car, Long>{
	void save (Car car);
	
	List<Car> getAllCars();
	
	Optional<Car> findOne(Long id);
	
	void delete(Long id);
	
	Car getCarById(Long id);
	
//	void update(Car car);
}
