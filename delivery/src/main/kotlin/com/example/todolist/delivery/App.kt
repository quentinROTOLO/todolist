package com.example.todolist.delivery

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication(scanBasePackages = [
    "com.example.todolist.delivery.config",
    "com.example.todolist.dataproviders.db.jpa.config",
    "com.example.todolist.delivery.rest.imp"
])
class App

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
