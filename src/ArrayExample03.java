import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
    public static void main(String[] args) {
        int[][] ab = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < ab.length; x++) {
            for (int y = 0; y < ab[x].length; y++) {
                ab[x][y] = sc.nextInt();
            }
        }
//        for (int x = 0; x < ab.length; x++) {
//            for (int y = 0; y < ab[x].length; y++) {
//                System.out.print(ab[x][y]+" ");
//            }
//            System.out.println();
//        }
//        for (int x = 0; x < ab.length; x++) {
//            System.out.println(Arrays.toString(ab[x]));
//        }
        for (int[] ints : ab) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
