import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        reverese(numArr);   // method call
        System.out.println("Reverse array is: ");
        ArrayUtility.displayArray(numArr);
    }

    public static void reverese(int[] arr){
        int i = 0;
        while(i < arr.length / 2){      // yeah loop ko half array tak hee chalayega
            int swap = arr[i];
            arr[i] = arr[(arr.length-1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
