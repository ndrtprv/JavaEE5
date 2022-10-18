package org.example;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.print("You draw a rectangle ");
    }

    public void draw(int length, int width) {
        draw();
        System.out.println("with the length " + length + " and the width " + width + ".");
    }
}