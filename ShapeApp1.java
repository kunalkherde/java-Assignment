import java.util.Scanner;
interface Shape {
    float Perimeter = 0;
    public void CalculateArea();
} 



class Rectangle implements Shape {
    int length;
    int width;

    public void CalculateArea(){
      Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length :");
            length = sc.nextInt();

            System.out.println("Enter the width :");
            width = sc.nextInt();

            float Perimeter = 2*(length + width);
            System.out.println("perimeter of the Rectangle is : " +Perimeter);
            // sc.close();
        
    }
}

    


class Square implements Shape {
    int side;

    public void CalculateArea(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side :");
            side = sc.nextInt();

            float Perimeter = 4*side;
            System.out.println("Perimeter  of the Square is : " +Perimeter);
        }
            
}
    
class Circle implements Shape{
    int radius;
    float pi = (float) 3.14;

    public void CalculateArea(){
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();

        float Perimeter = 2*pi*radius;
        System.out.println("Perimeter of circle is :" +Perimeter);
    }
}



public class ShapeApp1{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.CalculateArea();

        Square s1 = new Square();
        s1. CalculateArea();

        Circle c1 = new Circle();
        c1.CalculateArea();
        
    }
}
