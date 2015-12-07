package com.boroda.factory;

import com.boroda.core.BearBeard;
import com.boroda.core.Beard;
import com.boroda.core.RealBeard;

import java.util.ArrayList;
import java.util.List;

public class BeardsFactory {
    public List<Beard> list(){
        List<Beard> beards = new ArrayList<>();
        beards.add(getRealBeard());
        beards.add(getBearBeard());
        return beards;
    }

    private Beard getBearBeard() {
        return new BearBeard();
    }

    private Beard getRealBeard() {
        return new RealBeard();
    }
}
