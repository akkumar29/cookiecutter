package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.bean;

import org.springframework.stereotype.Component;

@Component
public class {{cookiecutter.controller}}Bean {
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
