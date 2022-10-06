import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> gf = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gf.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                        gf.get(i).add(sc.nextInt());
            }
        }
        System.out.println(gf);
    }
}
