import java.util.Arrays;
import java.util.Scanner;

public class ArrayExampleLecture12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int h = 0; h <n.length; h++) {
            n[h] = sc.nextInt();

        }
        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(n));
    }
}
