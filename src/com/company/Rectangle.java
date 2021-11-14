package com.company;

import java.util.Random;

class Rectangle extends Shape {
    private  double side1, side2;
    Rectangle(){
        Random random = new Random();
        side1 = random.nextInt(20) + 1;
        side2 = random.nextInt(20) + 1;
    }
    @Override
    public  double calcArea() {
        return side1 * side2;
    }
    public String toString(){
        return "Це прямокутник з площею " +  String.format("%.2f", calcArea());
    }
}
