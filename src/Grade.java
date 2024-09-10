import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1: ");
        float subject1 = input.nextFloat();
        System.out.print("Enter the marks of subject 2: ");
        float subject2 = input.nextFloat();
        System.out.print("Enter the marks of subject 3: ");
        float subject3 = input.nextFloat();
        System.out.print("Enter the marks of subject 4: ");
        float subject4 = input.nextFloat();
        System.out.print("Enter the marks of subject 5: ");
        float subject5 = input.nextFloat();
        float total = (subject1 + subject2 + subject3 + subject4 + subject5)/500 *100;
        System.out.println("Percentage: "+total+"%");
        if (total >=90){
            System.out.println("Grade: A");
        } else if (total >= 75) {
            System.out.println("Grade: B");
        }
        else if(total >= 60){
            System.out.println("Grade: C");
        }
        else if (total >=30) {
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
