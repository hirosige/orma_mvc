package com.java.hiro.ormamvc.views.todos;

import android.view.ViewGroup;
import android.widget.TextView;

import com.github.gfx.android.orma.example.Todo;
import com.github.gfx.android.orma.example.Todo_Selector;
import com.java.hiro.ormamvc.R;
import com.java.hiro.ormamvc.helpers.TodoHelper;
import com.java.hiro.ormamvc.views.ActiveView;

public class Index extends ActiveView {
    private Todo_Selector selector;
    private ViewGroup viewGroup;

    public Index(Todo_Selector selector, ViewGroup viewGroup) {
        super(new TodoHelper());
        this.selector = selector;
        this.viewGroup = viewGroup;
    }

    public void draw() {
        TextView textView = (TextView) viewGroup.findViewById(R.id.textview);

        for (Todo todo : selector) {
            String msg = "title: " + todo.title + " content: " + todo.content;
            textView.append(helper.breakLine(msg));
        }
    }
}
