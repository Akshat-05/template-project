package com.templateproject.templateproject.entity.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Data
@Entity
@IdClass(CarID.class)
@Table(name = "car")
public class CarEntity {

    @Id
    private String manufacturer;

    @Id
    private String model;

    private String year;

    private String color;

}
