package com.asjaHas.qamp.oophomework4.Task2;

public abstract class Shape {
    private final String colour;

    public Shape (final String colour) {
        this.colour = colour;
    }
    public abstract double getArea();

    public abstract double getCircumference();
    @Override
    public final String toString(){
        return "colour: " + this.colour + ", area: " + this.getArea() + ", circumference: " + this.getCircumference();
    }
}
