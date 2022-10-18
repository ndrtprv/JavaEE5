package org.example;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.print("You draw a circle ");
    }

    public void draw(int x, int y, int radius) {
        draw();
        System.out.println("with center at the point (" + x + ";" + y + ") and radius " + radius + ".");
    }
}