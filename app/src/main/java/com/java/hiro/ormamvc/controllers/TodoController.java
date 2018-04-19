package com.java.hiro.ormamvc.controllers;

import android.content.Context;
import android.view.ViewGroup;

import com.github.gfx.android.orma.example.Todo;
import com.github.gfx.android.orma.example.Todo_Selector;
import com.java.hiro.ormamvc.helpers.TodoHelper;
import com.java.hiro.ormamvc.models.TodoModel;
import com.java.hiro.ormamvc.views.todos.Index;

public class TodoController extends AppController {

    public TodoController(Context context, ViewGroup viewGroup) {
        super(context, viewGroup, new TodoHelper());
    }

    public void index() {
        TodoModel todoModel = new TodoModel(this.context);
        Todo_Selector selector = todoModel.selectAll();

        (new Index(selector, view)).draw();
    }

    public void begin() {
        // 入力画面を表示する
    }

    public void create() {
        TodoModel todoModel = new TodoModel(this.context);

        // Todo 本来はViewから取得した値 Start
        Todo todo = new Todo();
        int count = todoModel.selectAll().count() + 1;
        todo.title = "test" + count;
        todo.content = "test" + count;
        // End

        todoModel.insert(todo);
    }
}
