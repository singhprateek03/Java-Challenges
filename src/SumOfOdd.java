import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last element : ");
        int num = input.nextInt();
        int sum = SumOdd(num);
        System.out.println("The sum of odd number is: "+sum);
    }

    public static int SumOdd(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}