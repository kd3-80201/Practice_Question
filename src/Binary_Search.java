public class Binary_Search {
    public static void main(String[] args) {
        // find the target element using binary search
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 5;
        int ans = binary_Search(arr, target);
        System.out.println(ans);
    }

    static int binary_Search(int[] h, int target){
        int st = 0;
        int end = h.length - 1;
        while (st <= end){
            int mid = st + (end - st) / 2;

            if (target < h[mid]){
                end = mid - 1;
            } else if (target > h[mid]) {
                st = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
