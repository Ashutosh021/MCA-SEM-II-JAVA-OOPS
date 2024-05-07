// Write a Java program to create a class “SimpleObject” and display message by using constructor of this class.

class SimpleObject{
    SimpleObject(String msg){
        System.out.println("Message From Constructor :- "+msg);
    }
}
public class PRG4 {
    public static void main(String[] args) {   
       new SimpleObject("All Good here...");
    }
    
}
