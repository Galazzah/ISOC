package com.isoc;

import android.app.Application;
import android.content.Context;

/**
 * Created by Ghiyath on 7/13/2015.
 */

//Access to the Application context to ensure Singleton runs throughout each context
public class MyApp extends Application {
    private static MyApp sInstance;
    @Override
    public void onCreate(){
        super.onCreate();
        sInstance=this;
    }
    //Getter for context, used to access context for RequestQueue
    public static Context getAppContext(){
        return sInstance.getApplicationContext();
    }
}
