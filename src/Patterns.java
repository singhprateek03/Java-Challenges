import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = input.nextInt();
//        RightHalfPyramid(rows);
//        ReverseRightHalfPyramid(rows);
//        ReverseLeftHalfPyramid(rows);
        ReverseCenterPyramid(rows);
    }

        public static void RightHalfPyramid(int maxRows){
        int rows = 0;
        while(rows < maxRows){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void ReverseRightHalfPyramid(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while(i < rows){
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void ReverseLeftHalfPyramid(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            // this loop print spaces
            int j = 0;
            while (j < rows-1){
                System.out.print(" ");
                j++;
            }
            // this loop print stars
            int i = 0;
            while(i <=(maxRows - rows)){
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void ReverseCenterPyramid(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            // this loop print spaces
            int j = 0;
            while (j < rows-1){
                System.out.print(" ");
                j++;
            }
            // this loop print stars
            int i = 0;
            while(i <=(maxRows - rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
