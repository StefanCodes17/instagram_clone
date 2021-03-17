package com.example.insta_clone.ui.login;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cuMm2bEB3yDvARPRU6Y5c2Y9YVSrDPF1yy8I0QgQ")
                .clientKey("8WKanmnbMAK1BIe6gybyb09ga5SoqILPWQavwf0a")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
