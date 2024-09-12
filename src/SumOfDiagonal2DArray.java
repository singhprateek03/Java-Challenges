public class SumOfDiagonal2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("Sum of the diagonal is: "+sum);
    }
    public static long sumOfDiagonal(int[][] numArr){
        long leftSum = SumOfLeftDiagonal(numArr);
        long rightSum = SumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 != 0){
            int index = numArr.length / 2;      // isse humara central element aa jayega
            sum -= numArr[index][index];        // ek baar central element ko minus kar denge kyu yeah 2 baar aa chuka hoga
        }
        return sum;
    }

    public static long SumOfLeftDiagonal(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length){
            sum += numArr[i][i];     // e.g. index value (0,0) + (1,1) + (2,2)
            i++;
        }
        return sum;
    }

    public static long SumOfRightDiagonal(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length){
            int column = numArr.length - 1 - i; // yeah last column se suru hoga or decrement hote hote index 1 tak jayega
            sum += numArr[i][column];
            i++;
        }
        return sum;
    }
}
