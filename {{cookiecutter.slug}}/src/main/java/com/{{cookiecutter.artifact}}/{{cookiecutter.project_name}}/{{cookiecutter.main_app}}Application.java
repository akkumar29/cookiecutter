package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.main_app}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.main_app}}Application.class, args);
	}

}
