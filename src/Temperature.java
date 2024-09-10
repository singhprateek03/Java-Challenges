import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float fehrenheit = input.nextFloat();
        float celsius = (fehrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: "+celsius);
    }
}
