import java.util.Scanner;

public class First_java10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int og = d;
        int u =0;
        while (d>0){
            int r = d%10;
            u = u + r * r * r;
            d = d/10;
        }
        if (u == og){
            System.out.println("It is a Armstrong Number "+u );
        }
        else
            System.out.println("It's not an Armstrong Number "+u);
    }
}
