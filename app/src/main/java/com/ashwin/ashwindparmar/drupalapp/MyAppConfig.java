package com.ashwin.ashwindparmar.drupalapp;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by ashwin.d.parmar on 10/12/2017.
 */

public class MyAppConfig extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
