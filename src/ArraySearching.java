import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 9, 8, 5, 2, 10, 11, 25, 26, 65, 68, 98, 34, 36, 15, 75, 28};
        System.out.println("Enter the number you want to search in array: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("Your number is found in array.");
        }
        else {
            System.out.println("Your number is not found in array.");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
