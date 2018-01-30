package com.rentcar.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;

import com.rentcar.model.Car;

@Repository
public class CarDaoImpl implements CarDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Car car) {
		em.persist(car);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Car> getAllCars() {
		String hql = "FROM car ORDER BY car.id";
		return em.createQuery(hql).getResultList();
	}

	@Override
	public Optional<Car> findOne(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {
		em.remove(getCarById(id));
		
	}

	@Override
	public Car getCarById(Long id) {
		return em.find(Car.class, id);
	}

	/*@Override
	public void update(Car car) {
		Car obj = getCarById(car.getId());
		obj.setBrand(obj);
		em.flush();		
	}*/
	
	

}
