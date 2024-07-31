package com.example.todolist.ui.theme

import android.icu.text.CaseMap.Title
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.todolist.Todo
import java.time.Instant
import java.util.Date

object TodoManager {

    private val todoList = mutableListOf<Todo>()

    fun getAllTodo() : List<Todo>{
        return todoList
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String){
        todoList.add(Todo(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun deleteTodo(id: Int){
        todoList.removeIf{
            it.id==id
        }
    }

}