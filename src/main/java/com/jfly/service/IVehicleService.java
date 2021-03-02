package com.jfly.service;

import com.jfly.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface IVehicleService {

    public Vehicle createVehicle(String type,String modelCode, String brandName, String launchDate);

    public List<Vehicle> getAllVehicles(Integer count);
    public Optional<Vehicle> getVehicle(Long id);
}
