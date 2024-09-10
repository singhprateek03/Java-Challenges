import java.util.Scanner;
public class OccurrenceArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your element was found "+occurrences+" times in the array list.");
    }

    public static int noOfOccurrences(int[] numArr, int findNum){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if (numArr[i] == findNum){  // findNum main wo value aayegi jo user dalega
                occ++;
            }
            i++;
        }
        return occ;
    }
}
