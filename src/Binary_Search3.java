public class Binary_Search3 {
    //Smallest number in the array greater(>) or equal(=)target
    // if the number is lies in the array it will simply show in the index
    //either no given target element in the array is there, it will show the
    // next greater number{of the target element} which is smaller than rest of the element but greater than the target element
    public static void main(String[] args) {
        int[] say = {98,65,32,23,17,15,14};
        int point = 16;
        int ans = ceil(say,point);
        System.out.println(ans);
    }
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean tre = arr[start]<arr[end];

        while (start < end){
            int mid = start + (end - start) / 2;
            if (target == mid){
                return mid;
            }

            if (tre){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid -1;
                }
                else if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        return end;
    }
}
