package com.java.hiro.ormamvc;

import android.app.Application;
import android.content.Context;

import com.github.gfx.android.orma.AccessThreadConstraint;
import com.github.gfx.android.orma.example.OrmaDatabase;

public class OrmaMVC extends Application {
    private static Context context;
    private static OrmaDatabase db;

    public void onCreate(){
        super.onCreate();
        OrmaMVC.context = getApplicationContext();
        OrmaMVC.db = OrmaDatabase.builder(OrmaMVC.getAppContext())
                .name("main2.db")
                .readOnMainThread(AccessThreadConstraint.NONE)
                .writeOnMainThread(BuildConfig.DEBUG ? AccessThreadConstraint.WARNING : AccessThreadConstraint.NONE)
                .build();
    }

    public static Context getAppContext() {
        return OrmaMVC.context;
    }

    public static OrmaDatabase getOrma() {
        return OrmaMVC.db;
    }
}
