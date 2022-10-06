import java.util.Scanner;

public class First_java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Currency in Rupees");
        double a = sc.nextInt();
        double curr = a / 81;
        System.out.println("Currency in USD: "+curr);
    }
}
