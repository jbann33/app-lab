package com.astontech.applab.bootstrap;

import com.astontech.applab.domain.Vehicle;
import com.astontech.applab.domain.VehicleMake;
import com.astontech.applab.domain.VehicleModel;
import com.astontech.applab.services.VehicleMakeService;
import com.astontech.applab.services.VehicleModelService;
import com.astontech.applab.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private VehicleMakeService vehicleMakeService;

    @Autowired
    private VehicleModelService vehicleModelService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        generateVehicles();
    }

    private void generateVehicles() {
        VehicleMake toyota = new VehicleMake("Toyota");
        vehicleMakeService.saveVehicleMake(toyota);

        VehicleModel camry = new VehicleModel("Camry", toyota);
        vehicleModelService.saveVehicleModel(camry);

        Vehicle toyotaCamry = new Vehicle(1999, "ABC123", "B12345CDE6789001", "Tan", camry);
        vehicleService.saveVehicle(toyotaCamry);

        VehicleMake honda = new VehicleMake("Honda");
        vehicleMakeService.saveVehicleMake(honda);

        VehicleModel accord = new VehicleModel("Accord", honda);
        vehicleModelService.saveVehicleModel(accord);

        Vehicle hondaAccord = new Vehicle(1999, "QQQQQQ", "B12345CD23124789001", "Tan", accord);
        vehicleService.saveVehicle(hondaAccord);
    }
}
