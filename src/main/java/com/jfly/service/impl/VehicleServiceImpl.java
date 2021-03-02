package com.jfly.service.impl;

import com.jfly.entity.Vehicle;
import com.jfly.repository.VehicleRepository;
import com.jfly.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements IVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return vehicleRepository.save(vehicle).block();
    }
    @Override
    public List<Vehicle> getAllVehicles( Integer count) {
        return vehicleRepository.findAll().collectList().block().stream().limit(count).collect(Collectors.toList());
    }
    @Override
    public Optional<Vehicle> getVehicle(Long id) {
        return Optional.ofNullable(vehicleRepository.findById(id).block());
    }
}
