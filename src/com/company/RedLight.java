package com.company;

/**
 * Created by NortT on 13.03.2017.
 */
public class RedLight extends AbstractLight{
    private final int n = 5;

    @Override
    public int light() {
        System.out.println("Red light");
        sleep(n);
        return n;
    }
}
