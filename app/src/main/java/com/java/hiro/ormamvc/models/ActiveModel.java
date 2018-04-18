package com.java.hiro.ormamvc.models;

import android.content.Context;

import com.github.gfx.android.orma.AccessThreadConstraint;
import com.github.gfx.android.orma.example.OrmaDatabase;
import com.java.hiro.ormamvc.BuildConfig;

public class ActiveModel {
    public OrmaDatabase orma;

    ActiveModel(Context context) {
        this.orma = OrmaDatabase.builder(context)
            .name("main2.db") // default: "${applicationId}.orma.db"
            .readOnMainThread(AccessThreadConstraint.NONE)
            .writeOnMainThread(BuildConfig.DEBUG ? AccessThreadConstraint.WARNING : AccessThreadConstraint.NONE)
            .build();
    }
}
