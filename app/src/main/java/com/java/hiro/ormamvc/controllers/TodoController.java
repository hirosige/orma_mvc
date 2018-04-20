package com.java.hiro.ormamvc.controllers;

import android.view.ViewGroup;

import com.github.gfx.android.orma.example.Todo;
import com.github.gfx.android.orma.example.Todo_Selector;
import com.java.hiro.ormamvc.models.TodoModel;
import com.java.hiro.ormamvc.views.todos.Index;

public class TodoController extends AppController {

    public TodoController(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void index() {
        TodoModel todoModel = new TodoModel();
        Todo_Selector selector = todoModel.selectAll();

        (new Index(selector, view)).draw();
    }

    public void begin() {
        // 入力画面を表示する
    }

    public void create() {
        TodoModel todoModel = new TodoModel();

        // Todo 本来はViewから取得した値 Start
        Todo todo = new Todo();
        int count = todoModel.selectAll().count() + 1;
        todo.title = "test" + count;
        todo.content = "test" + count;
        // End

        todoModel.insert(todo);
    }
}
