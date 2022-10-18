package org.example;

public class GreenPen implements DrawingAPI{

    @Override
    public void drawCircle() {
        System.out.print("You're drawing with green pen ");
    }
}