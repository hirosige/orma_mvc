package com.java.hiro.ormamvc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.gfx.android.orma.example.Todo;
import com.github.gfx.android.orma.example.Todo_Selector;

import com.java.hiro.ormamvc.models.TodoModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;
        TodoModel todoModel = new TodoModel(context);

        Todo tmp_todo = new Todo();
        tmp_todo.title = "test";
        tmp_todo.content = "test";

        todoModel.insert(tmp_todo);

        TextView textView = (TextView) findViewById(R.id.textview);

        Todo_Selector selector = todoModel.selectAll();

        for (Todo todo : selector) {
            textView.append(todo.title);
        }
    }
}
