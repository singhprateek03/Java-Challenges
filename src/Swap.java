import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
//    int num1 = 10, num2 = 20, num3;
//        System.out.println("Before Swapping...");
//        System.out.println("num1 = "+num1+ "\nnum2 = "+num2);
//        System.out.println("After Swapping...");
//        num3 = num2;
//        num2 = num1;
//        num1 = num3;
//        System.out.println("num1 = "+num1+ "\nnum2 = "+num2);

        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println("After swapping...");
        System.out.println("first number "+a+ "\nsecond number: "+b);
    }
}