import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        float principle = input.nextFloat();
        System.out.print("Enter the years: ");
        float years = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rateOfInterest = input.nextFloat();
        float simpleInterest = (principle * years * rateOfInterest)/100;
        System.out.println("Interest amount: "+simpleInterest+"/year.");
    }
}
