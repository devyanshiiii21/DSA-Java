package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
   

    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
