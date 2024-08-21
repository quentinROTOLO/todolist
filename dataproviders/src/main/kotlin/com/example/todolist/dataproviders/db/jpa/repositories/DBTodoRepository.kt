package com.example.todolist.dataproviders.db.jpa.repositories

import com.example.todolist.dataproviders.db.jpa.entities.TodoEntity

interface DBTodoRepository : JpaTodoRepository<TodoEntity, String>