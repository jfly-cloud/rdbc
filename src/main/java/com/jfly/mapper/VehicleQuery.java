package com.jfly.mapper;

import com.jfly.entity.Vehicle;
import com.jfly.service.IVehicleService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private IVehicleService vehicleService;

    /**
     * getVehicles 和  vehicles
     * @param count
     * @return
     */
    public List<Vehicle> vehicles(Integer count) {
        return vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> vehicle(Long id) {
        return vehicleService.getVehicle(id);
    }
}