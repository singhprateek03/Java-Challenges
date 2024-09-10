import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        float product = num1 * num2;
        System.out.println("Product is: "+product);
    }
}
