package com.asjaHas.qamp.oophomework4.Task2;

public class Square extends Shape {
    public final double side;
    public Square(final String colour, final double side){
        super(colour);
        this.side = side;
    }
    @Override
    public final double getArea(){
        return this.side * this.side;
    }
    @Override
    public final double getCircumference(){
        return 4 * this.side;
    }
}
