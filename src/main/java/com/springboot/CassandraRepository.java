package com.springboot;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepository extends CrudRepository<Location, Serializable> {
	public Optional<Location> findByVehicleIdAndDate(String vehicleId, String date);
}