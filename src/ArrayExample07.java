import java.util.Arrays;

public class ArrayExample07 {
    public static void main(String[] args) {
        int[] k = {45,56,12,89,45};
        maximum(k);
        System.out.println(Arrays.toString(k));
        System.out.println("greater number fom this array is="+maximum(k));
    }

    static int maximum(int[] h) {
        int bc = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i]>h[0]){
                bc = h[i];
            }
        }
        return bc;
    }


}
