package com.company;


import java.util.Random;

class Circle extends Shape {
    private  double radius;
    Circle(){
        Random random = new Random();
        radius =  random.nextInt(10) + 1;
    }
    @Override
    public  double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString(){
        return "Це коло з площею " +  String.format("%.2f", calcArea());
    }
}