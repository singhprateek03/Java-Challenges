import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to check armstrong number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println(num+" is a armstrong.");
        }
        else{
            System.out.println(num+" is not a armstrong.");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigit = noOfDigit(num);
        int numCopy = num;
        System.out.println("No. of digits: "+noOfDigit);   // debugging
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(finalNumber, lastDigit);
        }
        System.out.println("Final number is: "+finalNumber);
        return finalNumber == numCopy;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        System.out.println("Pow of "+num1+ " is "+result);  // Debugging
        return result;
    }

    public static int noOfDigit(int num){   // yeah no. of digit batayega kitni hai
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}
