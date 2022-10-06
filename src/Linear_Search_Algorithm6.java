
public class Linear_Search_Algorithm6 {
    // Find the maximum value in the 2D array
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6,},
                      {78,98,65,35,34,24,8},
                      {85,52,35,15,22,16,97}};

        System.out.println(youtube(arr));
    }
    static int youtube(int[][] b){
        int max = b[0][0];
//        int max = Integer.MAX_VALUE; //can be used here
        for (int r = 0; r <b.length ; r++) {
            for (int c = 0; c < b[r].length; c++) {
                if (b[r][c] > max){
                    max = b[r][c];
                }
            }
        }
//        for (int[] ints : b) {
//            for (int anInt : ints) {
//                if (anInt > max) {
//                    max = anInt;
//                }
//            }
//        }
        return max;
    }
}
