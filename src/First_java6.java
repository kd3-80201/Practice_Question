import java.util.Scanner;

public class First_java6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int x = sc.nextInt();
        System.out.println("Enter 2nd num");
        int y = sc.nextInt();
        int h = Math.max(x,y);
        System.out.println("Maximum value will be: "+h);
    }
}
