import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample04 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(51);
//        list.add(20);
//        list.add(41);
//        list.add(451);
//        list.add(5196);
//
//        list.set(0,56);
//      //  list.remove(4);
//
//        list.clone();
//        System.out.println(list);
//
//       // System.out.println(list);


        Scanner bs = new Scanner(System.in);
        ArrayList<Integer> ac = new ArrayList<>();

        for (int y = 0; y < 5; y++) {
            ac.add(bs.nextInt());
        }
        // System.out.println(ac); //this is how a arraylist can be print in a simple manner

        for (int y = 0; y < 5; y++) {
            System.out.print(ac.get(y)+" ");
        }

    }
}
