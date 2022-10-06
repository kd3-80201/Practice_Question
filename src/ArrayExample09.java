import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] ty = {1,2,3,5,6,98,7,4};
    reverse(ty);
        System.out.println(Arrays.toString(ty));
    }
    static void reverse (int[] abc){
        int start = 0 ;
        int end = abc.length-1;
//        while(end>= start){
//            System.out.print(abc[end]+" ");
//            end = end - 1;
//        }
        while (start < end){
            //swap
            swap(abc, start,end);
        start++;
            end--;
        }
    }
    static void swap(int[]  arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
