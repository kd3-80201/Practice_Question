import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

//        if (a>b)
//        {
//            System.out.println(a);
//        } else System.out.println(Math.max(b, c));
        System.out.println(Math.max(a,Math.max(b,c)));
    }

}
