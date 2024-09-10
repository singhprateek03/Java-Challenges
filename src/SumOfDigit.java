import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to calculate the sum of digit: ");
        int num = input.nextInt();
        int sum = SumDigit(num);
        System.out.println("The sum of the digit is: "+sum);
    }

    public static int SumDigit(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
