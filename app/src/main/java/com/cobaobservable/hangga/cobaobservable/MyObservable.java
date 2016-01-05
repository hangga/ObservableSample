package com.cobaobservable.hangga.cobaobservable;

import java.util.Observable;

/**
 * Copyright (C) PT. Sebangsa Bersama - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Hangga Aji Sayekti, 16/12/15
 */
public class MyObservable extends Observable {

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        setChanged();
        notifyObservers();
    }

    private int count = 0;
}
