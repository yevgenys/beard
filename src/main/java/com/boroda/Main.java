package com.boroda;

import com.boroda.core.Beard;
import com.boroda.factory.BeardsFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BeardsFactory factory = new BeardsFactory();
        List<Beard> beards = factory.list();
        beards.forEach(Beard::show);
    }
}
