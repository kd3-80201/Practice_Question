import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 45, 85, 79, 64, 35, 10};
        int a = sc.nextInt();
        int b = sc.nextInt();
        maximumRange(arr, 0,4);
//        System.out.println(maximumRange(arr,a,b));
        System.out.println(Arrays.toString(arr));
    }

//    private static int maximumRange(int[] arr, int start, int end) {
//        int maxi = arr[start];
//        for (int i = 1; i < end; i++) {
//            if (arr[i] > maxi) {
//                maxi = arr[i];
//            }
//        }
//        return maxi;
//    }


    static void maximumRange(int[] yy,int start, int end) {
        int maxi = yy[start];
        for (int i =1; i < end; i++) {
            if (yy[i]>maxi){
                maxi = yy[i];
            }
        }
    }

}
