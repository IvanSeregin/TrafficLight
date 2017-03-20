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
        AbstractLight lights[] = {new GreenLight(), new YellowLight(), new RedLight()};
        int i=0;
        while (countSec <= n) {
            if (i == 3) i = 0;
            countSec += lights[i++].light();
        }
    }
}
