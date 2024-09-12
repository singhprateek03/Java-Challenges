import java.util.Scanner;

public class ArrayUtility {

    // taking input for 2D array
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns]; // user jo bhi value dalega woo iss main aayegi
        int i = 0;
        while(i < rows){    // for rows
            int j = 0;
            while(j < columns){
                System.out.print("Please enter the element rows: " +(i+1)+ " , columns: " +(j+1)+ " :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    // taking input for 1D array
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] nums = new int[size]; // user jo bhi value dalega woo iss main aayegi
        int i = 0;
        while(i < size){
            System.out.print("Please enter the element no " +(i+1)+ ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    // To print array
    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length)
        {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
