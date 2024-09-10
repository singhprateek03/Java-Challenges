import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int add = num1 + num2;
        System.out.println("Addition: "+add);
        int sub = num1 - num2;
        System.out.println("Subtraction: "+sub);
        int mult = num1 * num2;
        System.out.println("Multiplication: "+mult);
        int div = num1 / num2;
        System.out.println("Division: "+div);
        int modulus = num1 % num2;
        System.out.println("Modulus: "+modulus);
    }
}
