package com.example.android.architecture.blueprints.todoapp

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository
import com.example.android.architecture.blueprints.todoapp.data.source.local.ToDoDatabase

object ServiceLocator {

    private val database: ToDoDatabase? = null
    @Volatile
    var tasksRepository: TasksRepository? = null
}