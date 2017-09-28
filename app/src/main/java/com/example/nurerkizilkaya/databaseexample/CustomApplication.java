package com.example.nurerkizilkaya.databaseexample;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.app.Application;

/**
 * Created by a s u s on 27.9.2017.
 */
public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ActiveAndroid.dispose();
    }

}
