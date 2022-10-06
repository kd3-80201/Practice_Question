import java.util.Arrays;

public class Trying_VariableLengthArguments01 {
    public static void main(String[] args) {
        int[] a ={12,121,212,54,5544,545};
    change();
        System.out.println(Arrays.toString(a));
    }

    private static void change(int ...c) {
        System.out.println(Arrays.toString(c));

    }

}
