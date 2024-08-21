package com.example.todolist.dataproviders.db.jpa.entities

import com.example.todolist.core.entities.Todo
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jdk.jfr.Description
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

@Entity
@Table(name = "todos")
data class TodoEntity(
    @Id
    val id: Int,
    val title: String,
    val description: Description,
    val deadline: Long
)

// Mappers
fun TodoEntity.toTodo() =
    Todo(
        id = this.id,
        title = this.title,
        description = this.description,
        deadline = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.deadline), ZoneId.systemDefault())
    )

fun Todo.toTodoEntity() =
    TodoEntity(
        id = this.id,
        title = this.title,
        description = this.description,
        deadline = this.deadline!!.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
    )