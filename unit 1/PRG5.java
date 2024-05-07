// Write a program to demonstrate static variables, methods, and blocks.

public class PRG5 {
        // Static variable
        static int staticVar = 0;
        
        // Static block
        static {
            System.out.println("Static block executed.");
            staticVar = 10;
        }
        
        // Static method
        static void staticMethod() {
            staticVar +=5;
            System.out.println("Static method executed.");
            System.out.println("Value of staticVar: " + staticVar);
        }
        public static void main(String[] args) {
            // Accessing static variables and methods without creating an object
            System.out.println("Value of staticVar before method call: " + staticVar);
            staticMethod();
            
            // Accessing static variable after method call
            System.out.println("Value of staticVar after method call: " + staticVar);
        }
    }        
    

