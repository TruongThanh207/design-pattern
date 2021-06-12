package com.nhom7.design.patterns.CreationalPatterns.Builder;

//Director
public class Shop {
    public void Construct(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.BuildFrame();
        vehicleBuilder.BuildEngine();
        vehicleBuilder.BuildWheels();
        vehicleBuilder.BuildDoors();
    }
}
