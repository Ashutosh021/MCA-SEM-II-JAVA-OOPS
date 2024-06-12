// Create a class WriteEmployee having main method. Ask user to enter
// details of an employee and set them in an Employee object. Store details
// of this object in a file emp.txt.
//  Read employee details from the file and display those details. 


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prg6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String empName;
        int empNo, empBasic;
        Scanner input = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name=");
        empName = input.nextLine();
        System.out.println("Enter employee no=");
        empNo = s.nextInt();
        System.out.println("Enter employee salary=");
        empBasic = s.nextInt();
        input.close();
        s.close();
        File f = new File("D:\\VS CODE PROGRAM\\MCA\\2nd SEM\\Java LAB\\unit 3\\emp.txt");
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write("employee name:" + empName + " ");
            fw.write(" employee no:" + empNo + " ");
            fw.write(" employee salary:" + empBasic + " ");
            fw.close();
            System.out.println("data inserted");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
