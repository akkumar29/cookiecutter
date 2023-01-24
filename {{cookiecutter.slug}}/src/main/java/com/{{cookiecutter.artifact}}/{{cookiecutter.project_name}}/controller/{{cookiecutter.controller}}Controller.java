package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class {{cookiecutter.controller}}Controller {

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

}