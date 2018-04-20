package com.java.hiro.ormamvc.models;

import com.github.gfx.android.orma.example.Todo;
import com.github.gfx.android.orma.example.Todo_Selector;

public class TodoModel extends ActiveModel {
    public TodoModel() {
        super();
    }

    public void insert(Todo todo) {
        orma.insertIntoTodo(todo);
    }

    public Todo_Selector selectAll() {
        return orma.selectFromTodo();
    }
}
