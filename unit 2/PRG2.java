// Write a Java program to give a simple example for abstract class.

abstract class Shape {
    abstract double calculateArea();
    
    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    double length,width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double calculateArea() {
        return length * width;
    }
}

public class PRG2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        
        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

