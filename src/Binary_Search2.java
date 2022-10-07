import java.util.Scanner;

public class Binary_Search2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = {98,87,65,54,32,21};
        //int target = 32;
        System.out.println("Input target value");
        int target = sc.nextInt();
        int ans = agnostic_BinaryS(input,target);
        System.out.println(ans);
    }
    static int agnostic_BinaryS(int[] h, int target){
        int start = 0;
        int end = h.length - 1;
        boolean tr = h[start] < h[end];

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (tr){
                if (target < h[mid]){
                    end = mid - 1;
                }
                else if (target > h[mid]){
                    start = mid + 1;
                }
            }
            else{

                if (target > h[mid]) {
                end = mid - 1;
            }
            else if (target < h[mid]) {
                    start = mid + 1;
                }
            else {
                return mid;
                }
            }
        }
        return -1;
    }
}
