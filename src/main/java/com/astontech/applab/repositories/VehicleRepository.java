package com.astontech.applab.repositories;

import com.astontech.applab.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
