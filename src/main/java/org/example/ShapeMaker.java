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

    public void drawCircle(int x, int y, int radius) {
        circle.draw(x, y, radius);
    }

    public void drawSquare(int side) {
        square.draw(side);
    }

    public void drawRectangle(int length, int width) {
        rectangle.draw(length, width);
    }
}