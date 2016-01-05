package com.cobaobservable.hangga.cobaobservable;

import android.app.Application;

/**
 * Copyright (C) PT. Sebangsa Bersama - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Hangga Aji Sayekti, 16/12/15
 */
public class BaseApplication extends Application {

    MyObservable myObservable;

    @Override
    public void onCreate() {
        super.onCreate();
        myObservable = new MyObservable();
    }

    public MyObservable getMyObservable(){
        return myObservable;
    }
}
