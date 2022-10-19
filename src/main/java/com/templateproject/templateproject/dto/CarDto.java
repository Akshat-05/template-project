package com.templateproject.templateproject.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarDto {

    private String manufacturer;
    private String model;
    private String year;
    private String color;

}
