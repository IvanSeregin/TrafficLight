package com.company;

/**
 * Created by NortT on 12.03.2017.
 */
public class TrafficLight {
    private int n = 0;
    public TrafficLight(int n){
        this.n = n;
    }

    void start() {
        int countSec = 0;
        while (countSec <= n) {
            countSec += new GreenLight().light();
            countSec += new YellowLight().light();
            countSec += new RedLight().light();
        }
    }
}
