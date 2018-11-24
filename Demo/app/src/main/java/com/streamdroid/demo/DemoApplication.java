package com.streamdroid.demo;

import android.app.Application;

import com.streamoid.product.app.SDKManager;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SDKManager.initialize(this);
    }
}
