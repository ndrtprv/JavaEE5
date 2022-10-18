package org.example;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle(2, -7, 5);

        shapeMaker.drawSquare(10);

        shapeMaker.drawRectangle(7, 1);
    }
}