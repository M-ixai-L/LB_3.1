package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
         Shape compareArea = new Shape();
        ArrayList <Shape> data= new ArrayList<>();
        ShapeCompare compareColor = new ShapeCompare();
        int rand, num ;
        Scanner cin = new Scanner(System.in);
        System.out.println("Уведіть кількість фігур ");
        num =  cin.nextInt();
        for (int i = 0; i < num; i++) {
            rand = (int) random.nextInt(3);
            switch (rand) {
                case 0:
                    Circle cir = new Circle();
                    data.add(cir);
                    break;
                case 1:
                    Triangle tri = new Triangle();
                    data.add(tri);
                    break;
                case 2:
                    Rectangle rec = new Rectangle();
                    data.add(rec);
                    break;
            }

        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).draw());
        }
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i).calcArea();
        }
        System.out.println("\nСумарна площа всіх фігур " + String.format("%.2f", sum));

        System.out.println("\nСумарна площа всіх трикутників " + String.format("%.2f", sumTriangle(data)));
        System.out.println("\nСумарна площа всіх кіл " + String.format("%.2f", sumCircle(data)));
        System.out.println("\nСумарна площа всіх прямокутників " + String.format("%.2f", sumRectangle(data)));


        System.out.println("\nФігури відсортовані за площею ");
        data.sort(compareArea);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).draw());
        }

        System.out.println("\nФігури відсортовані за кольором ");
        data.sort(compareColor);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).draw());
        }

    }
    static double sumTriangle(ArrayList<Shape> data){
        double sum = 0;
       for (int i = 0; i < data.size(); i++){
           if (data.get(i) instanceof Triangle) sum += data.get(i).calcArea();
       }
       return sum;
    }
    static double sumCircle(ArrayList<Shape> data){
        double sum = 0;
        for (int i = 0; i < data.size(); i++){
            if (data.get(i) instanceof Circle)sum += data.get(i).calcArea();
        }
        return sum;
    }
    static double sumRectangle(ArrayList <Shape> data){
        double sum = 0;
        for (int i = 0; i < data.size(); i++){
            if (data.get(i) instanceof Rectangle)sum += data.get(i).calcArea();
        }
        return sum;
    }

}




