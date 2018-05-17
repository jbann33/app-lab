package com.astontech.applab.domain;

import javax.persistence.*;

@Entity
public class VehicleMake {

    //region PROPERTIES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VehicleMakeId")
    private Integer Id;

    @Version
    private Integer version;

    private String vehicleMakeName;
    //endregion

    //region CONSTRUCTORS
    public VehicleMake() {}
    public VehicleMake(String vehicleMakeName) {
        this.setVehicleMakeName(vehicleMakeName);
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

    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    public void setVehicleMakeName(String vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
    }
    //endregion


    @Override
    public String toString() {
        return vehicleMakeName;
    }
}
