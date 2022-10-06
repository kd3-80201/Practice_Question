import java.util.Scanner;

public class First_java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,t,r,SI;
        System.out.println("Enter Amount");
        p= sc.nextInt();
        System.out.println("Enter Time in months");
        t= sc.nextInt();
        System.out.println("Enter Interest in percentage");
        r= sc.nextInt();
        SI = (p * r * t/12)/100;
        System.out.println("Simple Interest is: "+SI);

        int amt = p + SI;
        System.out.println("Amount User will pay with Interest: "+amt);
    }
}
