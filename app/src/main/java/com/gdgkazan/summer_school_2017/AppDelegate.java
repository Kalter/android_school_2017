package com.gdgkazan.summer_school_2017;

import android.app.Application;

import com.gdgkazan.summer_school_2017.lesson_3.api.ApiFactory;
import com.facebook.stetho.Stetho;

/**
 * @author Timur Valiev
 */
public class AppDelegate extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ApiFactory.provideClient();
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}
