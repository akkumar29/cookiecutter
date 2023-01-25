package com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.repository;

import com.{{cookiecutter.artifact}}.{{cookiecutter.project_name}}.model.{{cookiecutter.controller}};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
