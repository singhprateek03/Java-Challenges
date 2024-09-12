import java.util.Scanner;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.print("Merge array is: ");
        ArrayUtility.displayArray(mergedArr);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length || j < arr2.length){
            if (j == arr2.length /* agar second array khatam ho gaya hai kuch bhi check mat karo */
                || i < arr1.length /* agar first array khatam ho gaya toh second array print hoga */
                && arr1[i] < arr2[j])
            {
                newArr[k] = arr1[i];    // yeah first array se element nikalega
                i++;
                k++;
            }
            else{
                newArr[k] = arr2[j];    // yeah second array se element nikalega
                k++;
                j++;
            }
        }
        return newArr;
    }
}
