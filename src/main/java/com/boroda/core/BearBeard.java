package com.boroda.core;

public class BearBeard implements Beard {
    @Override
    public void show() throws NoBeard {
        System.out.println("Bear beard!");
    }
}
