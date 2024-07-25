package com.example.todolist.core.entities

import jdk.jfr.Description
import java.time.LocalDateTime

data class Todo(
    val id: Int,
    val title: String,
    val description: Description,
    val deadline: LocalDateTime?,
)
/**
data class TodoList(val value: String)
 */
