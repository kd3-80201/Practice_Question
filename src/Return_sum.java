import java.util.Scanner;

public class Return_sum {
    public static void main(String[] args) {


        double abc = something();
        System.out.println(abc);
    }

     static double something() {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = x + y;
        return z;
    }
}
