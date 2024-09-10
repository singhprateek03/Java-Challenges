import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
//        System.out.print("Enter the second number: ");
//        int num2 = input.nextInt();
        // **** Bitwise AND Operator ****
//      int result = num1 & num2;

        // **** Bitwise OR Operator ****
//      int result = num1 | num2;

        // **** Bitwise XOR Operator ****
//      int result = num1 ^ num2;

        // **** Bitwise NOT Operator ****
//      int result = ~num2;

        // ***** Bitwise Right Operator ****
//        int result = num1 >> 1;

        // ***** Bitwise Left Operator ****
        int result = num1 << 1;
        System.out.println("Result: "+result);

    }
}
