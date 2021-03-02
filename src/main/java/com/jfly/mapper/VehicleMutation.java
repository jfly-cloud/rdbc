package com.jfly.mapper;

import com.jfly.entity.Vehicle;
import com.jfly.service.IVehicleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {
    @Autowired
    private IVehicleService vehicleService;

    /**
     * getCreateVehicle 和 createVehicle
     * @param type
     * @param modelCode
     * @param brandName
     * @param launchDate
     * @return
     */
    public Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}