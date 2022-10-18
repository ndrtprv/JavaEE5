package org.example;

public class RedPen implements DrawingAPI{

    @Override
    public void drawCircle() {
        System.out.print("You're drawing with red pen ");
    }
}