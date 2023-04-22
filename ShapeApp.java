/*
 * Assignment 3  
 * Name :- Kunal Snajayrao Kherde 
 * Roll No :- SYCOB290
 * Div :- B
 * Batch :- B4
 * 
 * Problem Statement :- Write a java program to create an abstract class named 
 * Shape that contains common member variables and an abstract method named calculateArea().
 * 
 * Aim :-To find the area of a rectangle, triangle, and
 * circle by inheriting an abstract class and implementing the methods in the subclasses. 
//  */
// package assign2_banking;
import java.util.Scanner;

abstract class Shape {
    // String color ;
    float farea;
    float fperimeter;
    // int no_of_side ;
  
    abstract public void CalculateArea();
}


class Rectangle extends Shape {
    int length;
    int bredth;

    public void CalculateArea(){
      Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length :");
            length = sc.nextInt();

            System.out.println("Enter the breath :");
            bredth = sc.nextInt();

            farea = length * bredth;
            System.out.println("Area of the Rectangle is : " +farea);
            // sc.close();
        
    }
}

class Square extends Shape {

    public void CalculateArea(){
      Scanner sc = new Scanner(System.in);
            System.out.print("Enter the side : ");
            int side = sc.nextInt();

            farea = side * side;
            System.out.println("Area of the Square is : " +farea);
            
    }
}

class Triangle extends Shape {
    int base ;
    int height;

    public void CalculateArea(){
          Scanner sc = new Scanner(System.in);
            System.out.println("Enter the base :");
            base = sc.nextInt();

            System.out.println("Enter the height :");
            height = sc.nextInt();

            farea = (base*height)/2;
            System.out.println("Area of the Triangle is : " + farea);     

    }

    
}
class Circle extends Shape{
    int radius;
    double pi = 3.14;
    public void  CalculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        radius = sc.nextInt();

        farea = (float) (pi*radius*radius);
        System.out.println("Area of Circle :" +farea);
    }
}


class ShapeApp{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.CalculateArea();

        Square s1 = new Square();
        s1.CalculateArea();

        Triangle t1 = new Triangle();
        t1.CalculateArea();

        Circle c1 = new Circle();
        c1.CalculateArea();
    }
}