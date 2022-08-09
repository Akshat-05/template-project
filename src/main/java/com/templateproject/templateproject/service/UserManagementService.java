package com.templateproject.templateproject.service;

import com.templateproject.templateproject.entity.UsersEntity;
import com.templateproject.templateproject.model.TemplateProjectResponse;
import com.templateproject.templateproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserManagementService {

    @Autowired
    UsersRepository repository;

    public ResponseEntity<TemplateProjectResponse> getAllUsers() {

        TemplateProjectResponse response = TemplateProjectResponse.builder()
                .success(true)
                .data(repository.findAll())
                .message("successful")
                .build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    public ResponseEntity<TemplateProjectResponse> getUsers(Long id) {
        Optional<UsersEntity> user = repository.findById(id);
        if (user.isPresent()) {
            TemplateProjectResponse response = TemplateProjectResponse.builder()
                    .success(true)
                    .data(List.of(user.get()))
                    .message("successful")
                    .build();
            return ResponseEntity.status(HttpStatus.OK)
                    .body(response);
        } else {
            TemplateProjectResponse response = TemplateProjectResponse.builder()
                    .success(false)
                    .message("Not found")
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(response);
        }
    }

}
