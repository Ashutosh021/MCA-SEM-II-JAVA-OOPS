// Write a Java program to create class Number with only one private instance variable as a double primitive type,
// include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() in
// this class and all above methods should return boolean primitive type like for isPositive() should return
// “Positive = True”


public class Number{
    private double num;

    public Number(double num) {
        this.num = num;
    }

    public boolean isZero() {
        return num == 0;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isArmstrong() {
        int temp=(int)num;
        int len=0;
        while(temp!=0){
            temp/=10;
            len++;
        }
        int temp2 = (int) num;
        int sum = 0;
        while (temp2 != 0) {
            int digit = temp2 % 10;
            sum += Math.pow(digit, len);
            temp2 /= 10;
        }
        return sum == (int) num;
    }

    public static void main(String[] args) {
        Number number = new Number(153);
        System.out.println("Is Zero: " + number.isZero());
        System.out.println("Is Positive: " + number.isPositive());
        System.out.println("Is Negative: " + number.isNegative());
        System.out.println("Is Odd: " + number.isOdd());
        System.out.println("Is Even: " + number.isEven());
        System.out.println("Is Prime: " + number.isPrime());
        System.out.println("Is Armstrong: " + number.isArmstrong());
    }
}
