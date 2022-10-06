import java.util.Scanner;

public class KnowingPrimeUsing_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean n = isPrime(input);
        System.out.println(n);
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <=n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
//        if (c*c>n){return true;} return false;
        return c*c>n; //Enhanced one
    }
}
