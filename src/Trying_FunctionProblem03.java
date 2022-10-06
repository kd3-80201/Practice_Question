import java.lang.reflect.Array;
import java.util.Arrays;

public class Trying_FunctionProblem03 {
    public static void main(String[] args) {
//        int[] arr = {1,2,56,498,48};
//        something(arr);
//        System.out.println(Arrays.toString(arr));
        int a = 10;
        int v = 20;
        swap(a, v);
        System.out.println(a + " " + v); //as we can see c and d have their own value rather a and v will stay the same because when c & d assigned they are saved in memory as another object
    }

     static void swap(int c , int d) {
        int temp = c;
        c = d;
        d = temp;

    }
//    static int something(int a[]){
//        a[4] =100;
//        System.out.println(a[4]);
//        return a[4];
//    }
}
