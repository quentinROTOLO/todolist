package com.example.todolist.dataproviders.db.jpa.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@Configuration
@EntityScan(basePackages = ["com.example.todolist.dataproviders.db.jpa.entities"])
@EnableJpaRepositories(basePackages = ["com.example.todolist.dataproviders.db.jpa.repositories"])
class DBConfig
