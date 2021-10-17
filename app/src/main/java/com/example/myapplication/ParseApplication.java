package com.example.myapplication;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RYvBDsPscdwcS5EjbpRbTaAkMZfTtUzo1Of7F92e")
                .clientKey("JS4E1wzqv59kn5aYWI3YwjVxwiSheXLWzSE4uJoq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
