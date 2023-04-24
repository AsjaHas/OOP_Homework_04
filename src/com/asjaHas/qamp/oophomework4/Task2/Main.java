package com.asjaHas.qamp.oophomework4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("orange", 3);
        Square square = new Square("blue", 4);
        Rectangle rectangle = new Rectangle("yellow", 2, 3);
        final List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(square);
        shapeList.add(rectangle);
        for (Shape shape : shapeList) {
            System.out.println(shape.getClass().getSimpleName() + " - " + shape.toString());
        }
    }
}
