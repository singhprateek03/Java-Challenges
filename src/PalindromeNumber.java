import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to check palindrome: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome){
            System.out.print("Your number is a palindrome.");
        }
        else{
            System.out.print("Your number is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num){
    return num == reverse(num);  // reverse method given number se compare karega agar value equal hue toh true hoga nhi toh false.
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
