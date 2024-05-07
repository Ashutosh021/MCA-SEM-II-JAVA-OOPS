// Write a Java program to find out the sum of command line arguments. 
public class PRG2 {
    public static void main(String[] args) {
            int argsLen = args.length;
            if(argsLen<2){
                System.out.println("Enter Minimum two Numbers");
            }
            else{
                int sum=0;
                for (String string : args) {
                    sum += Integer.parseInt(string);
                }
                System.out.println(sum);
                // System.out.println(args[0]+args[1]);
            }
    }
}
