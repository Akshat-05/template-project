package com.templateproject.templateproject.controller;

import com.templateproject.templateproject.model.TemplateProjectResponse;
import com.templateproject.templateproject.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class UserController {

    @Autowired
    UserManagementService service;

    @GetMapping("/allUser")
    public ResponseEntity<TemplateProjectResponse> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/user")
    public ResponseEntity<TemplateProjectResponse>  getUser(@RequestParam Long id) {
        return service.getUsers(id);
    }

}
