package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String firstName;

    private String lastName;

    private String address;
}
