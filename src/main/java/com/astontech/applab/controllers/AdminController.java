package com.astontech.applab.controllers;

import com.astontech.applab.domain.VO.VehicleVO;
import com.astontech.applab.domain.Vehicle;
import com.astontech.applab.domain.VehicleMake;
import com.astontech.applab.domain.VehicleModel;
import com.astontech.applab.services.VehicleMakeService;
import com.astontech.applab.services.VehicleModelService;
import com.astontech.applab.services.VehicleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdminController {

    @Autowired
    VehicleService vehicleService;

    @Autowired
    VehicleModelService vehicleModelService;

    @Autowired
    VehicleMakeService vehicleMakeService;

    private static Logger log = Logger.getLogger(AdminController.class);

    @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public String vehicleHome() {
        return "/app_components/home";
    }

    @RequestMapping(value = "/vehicle/add", method = RequestMethod.GET)
    public String vehicleAddGet(Model model) {
        model.addAttribute("vehicleVO", new VehicleVO());
        return "/vehicle/vehicle_add";
    }

    @RequestMapping(value = "/vehicle/add", method = RequestMethod.POST)
    public String vehicleAddPost(VehicleVO vehicleVO, Model model) {
        logVehicleVO(vehicleVO);
        saveVehicleFromVO(vehicleVO);
        model.addAttribute("vehicleVO", new VehicleVO());
        return "/vehicle/vehicle_add";
    }

    @RequestMapping(value = "/vehicle/list", method = RequestMethod.GET)
    public String vehicleList(Model model) {
        model.addAttribute("vehicleList", vehicleService.listAllVehicles());
        return "/vehicle/vehicle_list";
    }

    @RequestMapping(value = "/vehicle/edit/{Id}", method = RequestMethod.GET)
    public String vehicleEdit(@PathVariable int Id, Model model) {
        Vehicle vehicle = vehicleService.getVehicleById(Id);
        model.addAttribute("vehicleVO", new VehicleVO());
        model.addAttribute("vehicle", vehicle);
        return "/vehicle/vehicle_edit";
    }

    @RequestMapping(value = "/vehicle/update/", method = RequestMethod.POST)
    public String vehicleUpdate(Vehicle vehicle, Model model) {
        model.addAttribute("vehicle", vehicle);

        vehicleService.getVehicleById(vehicle.getId());

        vehicle.getVehicleModel().getVehicleMake().setVehicleMakeName(vehicle.getVehicleModel().getVehicleMake().getVehicleMakeName());
        vehicleMakeService.saveVehicleMake(vehicle.getVehicleModel().getVehicleMake());
        vehicle.getVehicleModel().setVehicleModelName(vehicle.getVehicleModel().getVehicleModelName());
        vehicleModelService.saveVehicleModel(vehicle.getVehicleModel());
        vehicle.setLicensePlate(vehicle.getLicensePlate());
        vehicle.setYear(vehicle.getYear());
        vehicle.setVin(vehicle.getVin());
        vehicle.setColor(vehicle.getColor());

        vehicleService.saveVehicle(vehicle);

        return "redirect:/vehicle/list";
    }

    @RequestMapping(value = "/vehicle/delete/{id}", method = RequestMethod.GET)
    public String vehicleDelete(@PathVariable int id) {
        vehicleService.deleteVehicle(id);
        return "redirect:/vehicle/list";
    }

    //region HELPER METHODS
    private void saveVehicleFromVO(VehicleVO vehicleVO) {
        VehicleMake newVehicleMake = new VehicleMake(vehicleVO.getNewVehicleMake());
        vehicleMakeService.saveVehicleMake(newVehicleMake);

        VehicleModel newVehicleModel = new VehicleModel(vehicleVO.getNewVehicleModel(), newVehicleMake);
        vehicleModelService.saveVehicleModel(newVehicleModel);

        Vehicle newVehicle = new Vehicle(vehicleVO.getYear(), vehicleVO.getLicensePlate(), vehicleVO.getVin(), vehicleVO.getColor(), newVehicleModel);
        vehicleService.saveVehicle(newVehicle);
    }

    private void logVehicleVO(VehicleVO vehicleVO) {
        log.info("New Vehicle || Make: " + vehicleVO.getNewVehicleMake()
                 + " Model: " + vehicleVO.getNewVehicleModel()
                 + " Year: " + vehicleVO.getYear()
                 + " License Plate: " + vehicleVO.getLicensePlate()
                 + " VIN: " + vehicleVO.getVin()
                 + " Color: " + vehicleVO.getColor());
    }
    //endregion

}
