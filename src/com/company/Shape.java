package com.company;

import java.util.Comparator;
import java.util.Random;


public class Shape implements Drawable, Comparator{
    public String shapeColor;


    public String draw(){
        return toString() + " колір якого "+ shapeColor  ;
    }
    Shape(){
            shapeColor = randColor();
    }
    public  double calcArea(){
        return 0;
    }
    public Shape[] push_back(Shape arr[], Shape new_object){
        Shape[] newArr = new Shape[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = new_object;
        return newArr;
    }
    public String toString(){
        return shapeColor;
    }
    public String randColor(){
        Random random = new Random();
        int rand = (int)random.nextInt(7);
        switch (rand) {
            case 0:
                return "червоний";
            case 1:
                return "жовтогарячий";
            case 2:
                return "жовтий";
            case 3:
                return "зелений";
            case 4:
                return "голубий";
            case 5:
                return "синій";
            case 6:
                return "фіолетовий";
            default: return"";
        }
    }
    @Override
    public  int compare(Object o1, Object o2){
        return (int)((Shape)o1).calcArea() - (int)((Shape)o2).calcArea();
    }
    public  int compareTo(Object o1){
        return (int)this.calcArea () - (int)((Shape)o1).calcArea();
    }
}
class ShapeCompare implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.shapeColor.compareTo(o2.shapeColor);
    }
}




