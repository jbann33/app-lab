package com.astontech.applab.domain;

import javax.persistence.*;

@Entity
public class Vehicle {

    //region PROPERTIES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VehicleId")
    private Integer Id;

    @Version
    private Integer version;

    private Integer year;
    private String licensePlate;
    private String vin;
    private String color;

    @OneToOne
    @JoinColumn(name = "VehicleModelId")
    private VehicleModel vehicleModel;
    //endregion

    //region CONSTRUCTORS
    public Vehicle() {}
    public Vehicle(Integer year, String licensePlate, String vin, String color, VehicleModel vehicleModel) {
        this.setYear(year);
        this.setLicensePlate(licensePlate);
        this.setVin(vin);
        this.setColor(color);
        this.setVehicleModel(vehicleModel);
    }
    //endregion

    //region GETTERS / SETTERS
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    //endregion




}
