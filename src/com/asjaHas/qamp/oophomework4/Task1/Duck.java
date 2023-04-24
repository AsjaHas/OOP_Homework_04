package com.asjaHas.qamp.oophomework4.Task1;

public class Duck implements Flight, Swim {
    @Override
    public String fly() {
        return "Flies with wings";
    }

    @Override
    public String swim() {
        return "Kinda floats";
    }
}
