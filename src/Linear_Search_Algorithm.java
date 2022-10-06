public class Linear_Search_Algorithm {
    //search the array return the index if item found, otherwise if item not found return -1
    public static void main(String[] args) {

        int[] p = {12, 123, 434, 565, 767, 7678, 543,789,9,-1};
        int t = -14;
        int ans = LinearSearch(p, t);
        System.out.println(ans);
    }
    static int LinearSearch(int[] a, int target){
        if (a.length == 0){ // if length of an array is zero
            return -1;
        }
        int c;
        for (int index = 0; index < a.length; index++) {
            if (a[index] == target){
                c = index;
                //c = a[index]; // for returning the index value
                return c;
                //return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        // Hence if target not found then -1
    return -1;
    }
}


//int c;
//        for (int i : a) {
//            if (i == target) {
//                c = i;
//               // return index;
//            //    c = i; // for returning the index value
//                return c;
//            }
//        }
//        // this line will execute if none of the return statement above have executed
//        // Hence if target not found then -1
//    return -1; // use when we have to show the index number
//    // return Integer.MAX_VALUE;  //use when we have to print index value and if in the value there is a -1 in the array that is why we put Integer.MAX_VALUE