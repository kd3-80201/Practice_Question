public class Binary_Search4 {
    public static void main(String[] args) {
        int[] input = {97,64,31,22,21,12,10,8};
        int show = 12;
        int ans = floor(input,show);
        System.out.println(ans);
    }
    static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        boolean find = arr[start]< arr[end];
        while (start < end){
            int mid = start + (end - start)/2;
            if (find){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    end = mid + 1;
                }
            }
            else {
                if (target < arr[mid]){
                    end = mid + 1;

                } else if (target > arr[mid]) {
                    start = mid - 1;
                }
            }
        }
        return end;
    }
}
