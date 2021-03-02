package com.jfly.repository;
import com.jfly.entity.Vehicle;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface VehicleRepository extends ReactiveSortingRepository<Vehicle, Long> {
}
