package com.company;

/**
 * Created by NortT on 13.03.2017.
 */
public abstract class AbstractLight {
    public abstract int light();
    public void sleep(int n) {
        try {
            Thread.sleep(n*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
