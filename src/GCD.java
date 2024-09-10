import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second value: ");
        int secondNum = input.nextInt();
        int gcd = GCD(firstNum, secondNum);  // Variable scoping -> (firstNum, secondNum)
        System.out.println("The Greatest Common Division is: "+gcd);
    }

    public static int GCD(int num1, int num2){
        int gcd = 1;  // gcd = 1 iss liye liya hai kyu sabse chota division 1 toh hoga hee hoga.
        int i = 2;
        int least = least(num1, num2);
        while(i <= least){
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
             }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
