import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of side A: ");
        int A = input.nextInt();
        System.out.print("Enter the value of side B: ");
        int B = input.nextInt();
        System.out.print("Enter the value of side C: ");
        int C = input.nextInt();
        System.out.print("Enter the value of side D: ");
        int D = input.nextInt();
        int perimeter = A+B+C+D;
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
}
