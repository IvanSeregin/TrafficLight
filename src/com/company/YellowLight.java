package com.company;

/**
 * Created by NortT on 13.03.2017.
 */
public class YellowLight extends AbstractLight {
    private final int n = 3;

    @Override
    public int light() {
        System.out.println("Yellow light");
        sleep(n);
        return n;
    }
}
