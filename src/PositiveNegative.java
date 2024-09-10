import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = input.nextInt();
        if (value > 0){
            System.out.println(value+" is a positive number.");
        }
        else if(value < 0){
            System.out.println(value+" is a negative number.");
        }
        else if(value == 0){
            System.out.println("Your number is zero.");
        }
    }
}
