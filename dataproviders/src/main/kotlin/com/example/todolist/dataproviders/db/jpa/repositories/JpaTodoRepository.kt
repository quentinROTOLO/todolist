package com.example.todolist.dataproviders.db.jpa.repositories

import com.example.todolist.core.entities.Todo
import com.example.todolist.dataproviders.db.jpa.entities.TodoEntity
import com.example.todolist.dataproviders.db.jpa.entities.toTodo
import com.example.todolist.delivery.usecases.core.gateways.TodoRepository


open class JpaTodoRepository(private val dbTodoRepository: DBTodoRepository) {
    TodoRepository {
        override fun existsTodo(todo: Todo) = dbTodoRepository.existsById(todo.id)

        override fun getByProductCode(todo: Todo) =
            dbTodoRepository.findById(todo.id).unwrap(TodoEntity::toTodo)

        @Transactional
        override fun save(product: Product) {
            dbProductRepository.save(product.toProductEntity())
        }

    }