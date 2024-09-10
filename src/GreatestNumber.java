import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter third number: ");

        int thirdNum = input.nextInt();
        if (firstNum >= secondNum && firstNum >= thirdNum){
            System.out.println(firstNum+" is greater.");
        }
        else if(secondNum >= thirdNum){
            System.out.println(secondNum+" is greater.");
        }
        else {
            System.out.println(thirdNum+" is greater.");
        }

    }
}
