package com.company;

/**
 * Created by NortT on 13.03.2017.
 */
public class GreenLight extends AbstractLight {
    private final int n = 2;

    @Override
    public int light() {
        System.out.println("Green light");
        sleep(n);
        return n;
    }
}
