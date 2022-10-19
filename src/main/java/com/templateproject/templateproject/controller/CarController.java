package com.templateproject.templateproject.controller;

import com.templateproject.templateproject.constant.GlobalConstant;
import com.templateproject.templateproject.dto.CarDto;
import com.templateproject.templateproject.entity.mysql.CarEntity;
import com.templateproject.templateproject.service.CarManagementService;
import com.templateproject.templateproject.service.ResponseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarManagementService service;

    @Autowired
    private ResponseService respService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/allCars")
    public ResponseEntity<Object> getAllCars() {
        return respService.generateResponse(service.getAll());
    }

    @GetMapping("/car")
    public ResponseEntity<Object> getCar(@RequestParam String manufacturer, String model) {
        return respService.generateResponse(service.getByID(manufacturer, model));
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveCar(@RequestBody CarDto car) {
        CarEntity carEntity = modelMapper.map(car, CarEntity.class);
        service.add(carEntity);
        return respService.generateResponse(GlobalConstant.SUCCESSFUL_MESSAGE);
    }


}
