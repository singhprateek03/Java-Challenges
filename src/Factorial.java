import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to calculate factorial: ");
        int num = input.nextInt();
        long fact = CalculateFactorial(num);
        System.out.println("The Factorial is: "+fact);
    }

    public static long CalculateFactorial(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
