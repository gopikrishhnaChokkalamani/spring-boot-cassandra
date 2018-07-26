package com.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class CassandraController {

	@Autowired
	private CassandraRepository repository;

	@GetMapping
	public ResponseEntity<?> getLocationDetails(@RequestParam("vehicle_id") String vehicleId,
			@RequestParam("date") String date) {
		Optional<Location> location = repository.findByVehicleIdAndDate(vehicleId, date);
		return location.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>( HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public void insertLocationDetails(@RequestBody Location location) {
		repository.save(location);
	}
}
