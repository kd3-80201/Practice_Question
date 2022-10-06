import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println(" Enter first index");
        int b = sc.nextInt();
        System.out.println("Enter second index");
        int v = sc.nextInt();
        swap(arr, b,v);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] bc , int index1 ,int index2){
        int temp = bc[index1];
        bc[index1] = bc[index2];
        bc[index2] = temp;
    }
}
