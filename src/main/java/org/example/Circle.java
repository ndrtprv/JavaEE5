package org.example;

public class Circle extends Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(DrawingAPI drawingAPI, int x, int y, int radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        getDrawingAPI().drawCircle();
        System.out.println("a circle with the center at the point ("
                + x + ";" + y + ") and the radius " + radius + ".");
    }
}