package com.company;

import java.util.Random;

class Triangle extends Shape {
    private  int side1, side2, side3;
    Triangle() {
         Random random = new Random();
             side1 = random.nextInt(15) + 6;
             side2 = random.nextInt(5) + 1;
             int max = (int) side1 + (int) side2;
             side3 = random.nextInt(max - 1) + 1;
                 while(side1 >= (side3 + side2)){
                         side1--;}

            while(side2 >= (side3 + side1)){
                side2--;}

    }
    @Override
    public  double calcArea() {
        double p = (double)(side1 + side2 + side3) / (double)2;
        double P = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return P;
    }

    public String toString(){
        return "Це трикутник з площею " +  String.format("%.2f", calcArea());
    }
}

