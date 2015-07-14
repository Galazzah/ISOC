package com.isoc;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Ghiyath on 7/13/2015.
 */
public class Singleton {
    private static Singleton sinstance=null;
    private RequestQueue mRequestQueue;
    private Singleton(){
        mRequestQueue= Volley.newRequestQueue(MyApp.getAppContext());
    }
    //Initialize Singleton object if one doesn't exist or return instance
    public static Singleton getinstance(){
        if(sinstance==null)
        {
            sinstance=new Singleton();
        }
        return sinstance;
    }
    //Singleton Request Queue for access to the RequestQueue from any activity
    public RequestQueue getmRequestQueue(){
        return mRequestQueue;
    }
}