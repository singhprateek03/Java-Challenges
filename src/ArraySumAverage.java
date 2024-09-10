import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args){
       int[] numArray = ArrayUtility.inputArray();
       long sum = sum(numArray);
        System.out.println("The sum of the array is: "+sum);
       double average = average(numArray);
        System.out.println("The average of the array is: "+average);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
