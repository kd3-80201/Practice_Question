public class Linear_Search_Algorithm3 {
    // search for 96 in the range of index [2, 4]
    public static void main(String[] args) {
        int[] yt = {12, 45, 96, 88, 10, 74};
        int r = 96;
        int st = 2;
        int end = 4;
        System.out.println(right(yt,r,st,end));
    }
    static int right(int[] a, int target, int start, int end){
        if (a.length==0){
            return -1;
        }
        for (int j = start; j <= end; j++) {
            if (a[j] == target){
                return j;
            }
        }
        //return false; String c = "home";  return c; Throw an error cuz we are returning int
        return -1; // we are returning an integer so that is why we can't return any String boolean etc.

    }
}
