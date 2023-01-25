package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.service;

import com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.bean.{{cookiecutter.controller}}Bean;
import org.springframework.stereotype.Service;

@Service
public class {{cookiecutter.controller}}Service {

    public {{cookiecutter.controller}}Bean sendMessage({{cookiecutter.controller}}Bean {{cookiecutter.controller}}){
        {{cookiecutter.controller}}.setMessage("Hello World Using Bean and Service");
        return {{cookiecutter.controller}};
    }


}
