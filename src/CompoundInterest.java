import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        float principle = input.nextFloat();
        System.out.print("Enter the year: ");
        float year = input.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float rateOfInterest = input.nextFloat();

        double compoundInterest = principle * Math.pow((1 + rateOfInterest/100),year);
        System.out.println("Compound Interest is: "+compoundInterest);
    }
}
