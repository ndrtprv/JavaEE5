package org.example;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.print("You draw a square ");
    }

    public void draw(int side) {
        draw();
        System.out.println("with the side " + side + ".");
    }
}