package com.templateproject.templateproject.repository.mysql;

import com.templateproject.templateproject.entity.mysql.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, String> {
    Optional<CarEntity> findByManufacturerAndModel(String manufacturer, String model);
}
