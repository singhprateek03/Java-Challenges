//import java.util.Scanner;
//public class MultiplicationTable {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number you want a table: ");
//        int table = input.nextInt();
//        int i = 1;
//        while(i <= 10){
//            System.out.println(table+" X "+i+ " = "+ table*i);
//            i++;
//        }
//    }
//}

// By using method
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number you want a table: ");
        int num = input.nextInt();
        Table(num);
    }

    public static int Table(int num){
        int i = 1;
        while(i <=10){
            System.out.println(num+" X "+ i +" = "+num*i);
            i++;
        }
        return num;
    }
}