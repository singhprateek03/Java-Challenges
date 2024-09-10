import java.util.Scanner;
public class PrimeNumber {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the value to check prime number: ");
         int num = input.nextInt();
         boolean isPrime = isPrime(num);
         if(isPrime){
             System.out.println(num+" is a prime.");
         }
         else{
             System.out.println(num+" is not a prime.");
         }
     }
     public static boolean isPrime(int num){
         int i = 2;
         while(i < num){
             if (num % i == 0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
