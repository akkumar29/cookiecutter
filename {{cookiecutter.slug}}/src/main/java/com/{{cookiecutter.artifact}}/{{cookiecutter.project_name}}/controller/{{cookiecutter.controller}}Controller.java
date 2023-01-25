package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.controller;

import com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.bean.{{cookiecutter.controller}}Bean;
import com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.service.{{cookiecutter.controller}}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class {{cookiecutter.controller}}Controller {
    private {{cookiecutter.controller}}Service service;

    @Autowired
    {{cookiecutter.controller}}Controller({{cookiecutter.controller}}Service service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorldService")
    public String helloWorldService(){
        {{cookiecutter.controller}}Bean bean = new {{cookiecutter.controller}}Bean();
        service.sendMessage(bean);

        return bean.getMessage();
    }
}