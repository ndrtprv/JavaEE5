package org.example;

public class Shape {
    private DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }

    public void draw() {
        drawingAPI.drawCircle();
        System.out.println("a simple shape.");
    }

    public DrawingAPI getDrawingAPI() {
        return drawingAPI;
    }
}