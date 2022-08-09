package com.templateproject.templateproject.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
public class TemplateProjectRequest {

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

}
