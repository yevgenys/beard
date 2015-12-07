package com.boroda.core;

public class RealBeard implements Beard {
    @Override
    public void show() throws NoBeard {
        System.out.println("Real Beard");
    }
}
