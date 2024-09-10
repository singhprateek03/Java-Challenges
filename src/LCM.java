import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second value: ");
        int secondNum = input.nextInt();
        int lcm = lcm(firstNum, secondNum);
        System.out.println("LCM of two number is: "+lcm);
    }

    public static int lcm(int first, int second){
        int i = 1;
        while(/* i <= second */true){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
