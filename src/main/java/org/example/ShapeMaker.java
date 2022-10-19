package org.example;

public class ShapeMaker {
    private final Circle circle;
    private final Square square;
    private final Rectangle rectangle;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw(2, -7, 5);
    }

    public void drawSquare() {
        square.draw(10);
    }

    public void drawRectangle() {
        rectangle.draw(7, 1);
    }
}