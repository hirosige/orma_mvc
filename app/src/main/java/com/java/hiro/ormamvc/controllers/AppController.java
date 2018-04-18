package com.java.hiro.ormamvc.controllers;

import android.content.Context;
import android.view.ViewGroup;
import com.java.hiro.ormamvc.helpers.AppHelper;

class AppController {
    Context context;
    ViewGroup view;
    AppHelper helper;

    AppController(Context context, ViewGroup viewGroup, AppHelper helper) {
        this.context = context;
        this.view = viewGroup;
        this.helper = helper;
    }
}
