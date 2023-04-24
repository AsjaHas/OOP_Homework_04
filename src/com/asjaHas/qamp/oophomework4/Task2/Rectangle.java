package com.asjaHas.qamp.oophomework4.Task2;

public class Rectangle extends Shape {
    public final double a;
    public final double b;
    public Rectangle(final String colour, final double a, final double b){
        super(colour);
        this.a = a;
        this.b = b;
    }
    @Override
    public final double getArea(){
        return this.a * this.b;
    }
    @Override
    public final double getCircumference(){
        return 2 * this.a + 2 * this.b;
    }
}
