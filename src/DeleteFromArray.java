import java.util.Scanner;
public class DeleteFromArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is a new array: "+newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete){

    }
}
