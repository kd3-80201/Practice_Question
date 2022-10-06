import java.util.Scanner;

public class Assignment05 {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int b;
        Scanner sc = new Scanner(System.in);
        //char ch = sc.next().trim().charAt(0);
        int sum = 0;
        while (true) {
            String num = sc.next();

            if (num.equals("x") || num.equals("X")) {
                break;
            }

            b = Integer.parseInt(num);
            sum = sum + b;
        }
        System.out.println(sum);
    }
}
