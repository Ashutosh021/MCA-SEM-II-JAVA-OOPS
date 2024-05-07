// Write a Java program to insert 3 numbers from keyboard and find out greater number among 3 numbers
import java.util.Scanner;

public class PRG1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first Number :- ");
            int num1 = sc.nextInt();
            System.out.println("Enter second Number :- ");
            int num2 = sc.nextInt();
            System.out.println("Enter third Number :- ");
            int num3 = sc.nextInt();
            int ans = num1>num2?(num1>num3?num1:num3):(num2>num3)?num2:num3;

            if(num1>num2){
                if(num1>num3){
                    System.out.println(num1+"is greater");
                }else{
                    System.out.println(num3+"is greater");
                }
            }
            else{
                if (num2>num3) {
                    System.out.println(num2+"is greater");
                }else{
                    System.out.println(num3+"is greater");
                }
            }
            System.out.println("Maximum is :- "+(ans));
        }
        
    }
}
