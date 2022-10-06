import java.util.Arrays;
import java.util.Scanner;

public class ArrayExampleLecture12_02 {
    public static void main(String[] args) {
//        int[] ac =new int[5];
//        for (int j = 0; j < ac.length; j++) {
//            Scanner sc = new Scanner(System.in);
//            ac[j]=sc.nextInt();
//        }
//        for (int num : ac){
//            System.out.print(num+" ");
//        }
        Scanner sc = new Scanner(System.in);
        int[][] st = new int[3][2];
        for (int r = 0; r < st.length; r++) {
            for (int c = 0; c < st[r].length; c++) {
                st[r][c]= sc.nextInt();
            }

        }
        for (int r = 0; r < st.length; r++) {
            for (int c = 0; c < st[r].length; c++) {
                System.out.print(st[r][c]+" ");
            }
            System.out.println();
        }
    }
}