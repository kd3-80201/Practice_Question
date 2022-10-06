import java.util.Scanner;

public class First_java9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h = t;
        int r = 0;
        while (t>0){
            int y = t%10;  //1234
            r = r * 10 + y;
            t = t/10;
        }
        if (r == h){
            System.out.println("it is a palindrome "+r);
        }
        else
            System.out.println("it is not a palindrome number ");
    }
}
