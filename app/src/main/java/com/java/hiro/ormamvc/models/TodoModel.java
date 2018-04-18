package com.java.hiro.ormamvc.models;

import android.content.Context;

import com.github.gfx.android.orma.example.Todo;
import com.github.gfx.android.orma.example.Todo_Selector;

/**
 * Created by hiro on 2018/04/18.
 */

public class TodoModel extends ActiveModel {
    public TodoModel(Context context) {
        super(context);
    }

    public void insert(Todo todo) {
        orma.insertIntoTodo(todo);
    }

    public Todo_Selector selectAll() {
        return orma.selectFromTodo();
    }
}
