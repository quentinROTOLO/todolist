package com.example.todolist.delivery.usecases.core.gateways

import com.example.todolist.delivery.usecases.core.product.CreateTodoUseCase
import com.example.todolist.delivery.usecases.core.product.GetTodoByIdUseCase

interface TodoRepository : GetTodoByIdUseCase.TodoRepository, CreateTodoUseCase.TodoRepository