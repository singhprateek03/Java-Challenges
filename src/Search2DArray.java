import java.util.Scanner;
public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numArray = ArrayUtility.input2DArray();
        System.out.println("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = search(numArray, num);
        if(isFound){
            System.out.println(num+" was found in array.");
        }
        else{
            System.out.println(num+" was not found in array.");
        }
    }

    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                if (numArr [i][j] == num){
                return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
