import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args){
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        System.out.println("Max value is: "+max);
        int min = min(numArr);
        System.out.println("Min value is: "+min);
    }
    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;    // Integer is a class and MAX_VALUE is a constant jo ki sabse bade value ko nikalata hai
        int i = 0;
        while(i < numArr.length){
            if (min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] numArr){
        if (numArr.length == 0){
            return Integer.MIN_VALUE;  // Integer is a class and MIN_VALUE is a constant jo ki sabse chote value ko nikalata hai
        }
        int max = numArr[0];
        int i = 1;
        while(i < numArr.length){
            if (max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
}
