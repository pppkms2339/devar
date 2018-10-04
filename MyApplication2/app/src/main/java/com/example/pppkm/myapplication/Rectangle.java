package com.example.pppkm.myapplication;

public class Rectangle {
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int a) {
        this.height = this.width = a;
    }

    public int getArea() {
        return height * width;
    }
}
