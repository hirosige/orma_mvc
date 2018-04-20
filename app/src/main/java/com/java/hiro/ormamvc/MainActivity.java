package com.java.hiro.ormamvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.java.hiro.ormamvc.controllers.TodoController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.layout);

        TodoController todoController = new TodoController(viewGroup);
        todoController.create();

        todoController.index();
    }
}
