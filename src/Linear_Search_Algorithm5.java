import java.util.Arrays;
// find the index number in 2D array where the target number is, either return {-1, -1}
public class Linear_Search_Algorithm5 {
    public static void main(String[] args) {
        int[][] something= {{1, 2, 3, 4},
                            {4, 5, 6, 7, 9, 10},
                            {98, 87, 54, 95, 62, 10}};
        int tr = 62;
        int[] ans = find(something,tr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[][] three, int target){
        for (int r = 0; r < three.length; r++) {
            for (int c = 0; c < three[r].length; c++) {
                if (three[r][c] == target){
                    return new int[]{r, c};
                }

            }

        }
        return new int[]{-1, -1};
    }
}
