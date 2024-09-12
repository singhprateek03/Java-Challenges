public class SumAverage2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double average = average(numArr);
        System.out.println("Sum of the array is: "+sum);
        System.out.println("Average of the array is: "+average);
    }

    public static double average(int[][] numArr){
        if(numArr.length == 0){     // agar user ne kuch bhi nhi daala toh yeah return 0 karega.
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr.length;
        double size = rows * cols;
        return sum(numArr)/size;
    }

    public static long sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
