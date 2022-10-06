import java.util.Scanner;

public class assignment04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd =1;
        for (int i = 1; i < a; i++) {
//            if (a%i==0&&b%==0)
            if (a%i==0 && b%i==0)
                gcd= i;
        }
        System.out.println("GCD is: "+gcd);
    }
}
