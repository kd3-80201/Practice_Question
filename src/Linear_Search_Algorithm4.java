public class Linear_Search_Algorithm4 {
    // Return the minimum value from the array
    public static void main(String[] args) {
        int[] arr = {12, 23, 56, 8, -9, 78, 10,-10};
        System.out.println(value(arr));
    }
    static int value(int [] b){
        int ans = b[0];
        for (int i = 0; i < b.length; i++) {
         if (b[i] < ans){
             ans = b[i];
         }
        }
//        for (int j : b) {
//            if (j < ans) {
//                ans = j;
//            }
//        }
        return ans;
    }
}
