package org.example;

public class BridgePatternDemo {
    public static void main(String[] args) {

        RedPen redPen = new RedPen();
        GreenPen greenPen = new GreenPen();

        Shape shape1 = new Shape(redPen);
        shape1.draw();

        Shape shape2 = new Shape(greenPen);
        shape2.draw();

        Circle circle1 = new Circle(redPen, 5, -1, 5);
        circle1.draw();

        Circle circle2 = new Circle(greenPen, 0, 0, 1);
        circle2.draw();
    }
}