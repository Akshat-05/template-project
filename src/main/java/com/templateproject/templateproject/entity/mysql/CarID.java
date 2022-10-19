package com.templateproject.templateproject.entity.mysql;

import java.io.Serializable;
import java.util.Objects;

public class CarID implements Serializable {

    private String manufacturer;
    private String model;

    public CarID() {
    }

    public CarID(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarID id = (CarID) o;
        if (manufacturer != id.manufacturer) return false;
        return model == id.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model);
    }


}
