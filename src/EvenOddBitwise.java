import java.util.Scanner;
public class EvenOddBitwise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = input.nextInt();
        if ((num & 1) == 1){
            System.out.println(num+" is a odd.");
        }
        else {
            System.out.println(num+" is a even.");
        }
    }
}
