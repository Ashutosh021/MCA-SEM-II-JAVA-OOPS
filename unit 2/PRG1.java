// Write a Java program to create a class named Shape and create three sub classes Circle, Triangle and Square,
// each class has two-member function named draw () and erase (). Implement this concepts using polymorphism.

class Shape {
    void draw() {
        System.out.println("Default Draw");
    }
    
    void erase() {
        System.out.println("Default Erase");
    }
}

class Circle extends Shape {
    void draw(float r) {
        System.out.println("Circle Draw r = "+Math.round(Math.PI*r*r));
    }

    void erase() {
        System.out.println("Circle Erase");
    }
}

class Triangle extends Shape {
    void draw(int b,int h) {
        System.out.println("Triangle Draw Area = "+(0.5*b*h));
    }

    void erase() {
        System.out.println("Triangle Erase");
    }
}

class Square extends Shape {
    void draw(int side) {
        System.out.println("Square Draw Area = "+(side*side));
    }

    void erase() {
        System.out.println("Square Erase");
    }
}

public class PRG1 {
    public static void main(String[] args) {

        Shape sh= new Shape();
        sh.draw();
        sh.erase();
        Circle cr= new Circle();
        cr.draw(4);
        cr.erase();
        Triangle tr= new Triangle();
        tr.draw(4,2);
        tr.erase();
        Square s= new Square();
        s.draw(4);
        s.erase();


        // Shape s = new Circle();
        // s.erase();
    }
}
