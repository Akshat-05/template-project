package com.templateproject.templateproject.service;

import com.templateproject.templateproject.entity.mysql.CarEntity;
import com.templateproject.templateproject.repository.mysql.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarManagementService {

    @Autowired
    private CarRepository repo;

    public void add(CarEntity car) {
        repo.save(car);
    }

    public CarEntity getByID(String manufacturer, String model) {
        Optional<CarEntity> car = repo.findByManufacturerAndModel(manufacturer, model);
        return car.orElse(null);
    }

    public List<CarEntity> getAll() {
        return repo.findAll();
    }

}

