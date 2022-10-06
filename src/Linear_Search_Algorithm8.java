public class Linear_Search_Algorithm8 {
    public static void main(String[] args) {

        int[][] city = {{23,56,45},
                        {122,32,65},
                        {5,8,7}};
        System.out.println(maximum(city));
    }
    static int maximum(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            int bank = 0;
            for (int anInt : ints) {
                bank = bank + anInt;
            }
            if (bank > ans) {
                ans = bank;
            }
        }

//        for (int r = 0; r < acc.length; r++) {
//            int bank = 0;
//            for (int c = 0; c < acc[r].length; c++) {
//                bank = bank + acc[r][c];
//            }
//            if (bank > ans){
//                ans = bank;
//            }
//        }
        return ans;
    }
}
