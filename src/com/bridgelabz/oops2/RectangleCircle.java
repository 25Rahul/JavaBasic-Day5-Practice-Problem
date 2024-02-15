package com.bridgelabz.oops2;

abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Rectangle extends Shape {
     private double width;
     private double height;

     public Rectangle(double width ,double height){
         this.width = width;
         this.height = height;
     }

     double area(){
         return width * height;
     }
      double perimeter(){
          return 2 * (width + height);
      }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
    }

}
