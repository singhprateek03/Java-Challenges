import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age <= 13){
            System.out.print("Child");
        }
        else if(age <=20){
            System.out.print("Teenager");
        }
        else if(age < 60){
            System.out.print("Adult");
        }
        else if(age > 60){
            System.out.print("Senior Citizen");
        }
        else {
            System.out.println("Invalid age.");
        }
    }
}
