import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        someting(12,12,20,56,15,6,56,656,656,656,56,9,9);
    }
    static void someting(int ...b){
        System.out.println(Arrays.toString(b));
    }
}
