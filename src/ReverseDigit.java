import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse number is: "+reverse);
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;  // yeah last digit ko nikalega
            newNum = newNum *10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
