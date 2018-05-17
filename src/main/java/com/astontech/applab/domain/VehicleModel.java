package com.astontech.applab.domain;

import javax.persistence.*;

@Entity
public class VehicleModel {

    //region PROPERTIES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VehicleModelId")
    private Integer Id;

    @Version
    private Integer version;

    private String vehicleModelName;

    @ManyToOne
    @JoinColumn(name = "VehicleMakeId")
    private VehicleMake vehicleMake;
    //endregion

    //region CONSTRUCTORS
    public VehicleModel() {}
    public VehicleModel(String vehicleModelName, VehicleMake vehicleMake) {
        this.setVehicleModelName(vehicleModelName);
        this.setVehicleMake(vehicleMake);
    }
    public VehicleModel(String vehicleModelName) {
        this.setVehicleModelName(vehicleModelName);
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

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public VehicleMake getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    //endregion
}
