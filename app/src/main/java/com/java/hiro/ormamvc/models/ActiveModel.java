package com.java.hiro.ormamvc.models;

import com.github.gfx.android.orma.example.OrmaDatabase;
import com.java.hiro.ormamvc.OrmaMVC;

public class ActiveModel {
    public OrmaDatabase orma;

    ActiveModel() {
        this.orma = OrmaMVC.getOrma();
    }
}
