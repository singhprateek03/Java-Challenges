import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even number.");
        }
        else if(num % 2 == 1){
            System.out.println(num+" is odd number.");
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
