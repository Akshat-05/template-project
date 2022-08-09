package com.templateproject.templateproject.model;

import lombok.Data;
import lombok.NonNull;

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
