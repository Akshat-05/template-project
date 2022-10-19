package com.templateproject.templateproject.service;

import com.templateproject.templateproject.model.TemplateProjectResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    public ResponseEntity<Object> generateResponse(Object ob) {
        if (ob != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(TemplateProjectResponse.builder()
                            .success(true)
                            .data(ob)
                            .message("successful")
                            .build());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(TemplateProjectResponse.builder()
                        .success(false)
                        .message("Not found")
                        .build());
    }
}
