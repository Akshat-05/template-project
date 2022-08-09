package com.templateproject.templateproject.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.templateproject.templateproject.entity.UsersEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateProjectResponse {

    private boolean success;

    private List<UsersEntity> data;

    private String message;

}
