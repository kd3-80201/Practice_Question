public class Linear_Search_Algorithm7_1 {
    public static void main(String[] args) {
        int[] nums = {22, 1374, 579,545};
        System.out.println(FoundNumber(nums));
    }
    static int FoundNumber(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)){
                count ++;
            }
        }
        return count;
    }

     static boolean even(int  arr2) {
        int OfDigit = digits(arr2);
        return OfDigit %2 == 0;
    }
    static int digits(int arr3){
        if (arr3 < 0){
            arr3 = arr3 * -1;
        }
        if (arr3 == 0){
            return 1;
        }
        int add = 0;
        while (arr3 > 0){
            add++;
            arr3 = arr3 / 10;
        }
        return add;
    }
}
