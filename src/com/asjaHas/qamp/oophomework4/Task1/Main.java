package com.asjaHas.qamp.oophomework4.Task1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Plane plane = new Plane();
        Duck duck = new Duck();
        Pegasus pegasus = new Pegasus();
        Submarine submarine = new Submarine();

        ArrayList<Flight> IFlyList = new ArrayList<>();
        IFlyList.add(plane);
        IFlyList.add(duck);
        IFlyList.add(pegasus);

        LinkedList<Swim> ISwimList = new LinkedList<>();
        ISwimList.add(fish);
        ISwimList.add(duck);
        ISwimList.add(submarine);

        for (Flight IFly : IFlyList) {
            System.out.println(IFly.getClass().getSimpleName() + ": " + IFly.fly());
        }

        for (Swim ISwim : ISwimList) {
            System.out.println(ISwim.getClass().getSimpleName() + ": " + ISwim.swim());
        }
    }
}
