import java.util.Arrays;

public class Changing_WithAnArrayStatic {
    public static void main(String[] args) {
        int[] bc = {12,15,46,78};
        kuch(bc);
        System.out.println(Arrays.toString(bc));
    }

    static void kuch(int[] bc) {
        bc[2]=88;
    }
}
