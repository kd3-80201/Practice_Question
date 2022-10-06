import java.util.Scanner;

public class assignment04_3 {
    public static void main(String[] args) {
        int s,hcf,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int temp1 = a;
        int temp2 = b;

        while (temp2 != 0){
         s = temp2;
         temp2 = temp1%temp2;
         temp1 = s;
        }
        hcf = temp1;
        lcm = (a*b)/hcf;
        System.out.println("HCF would be "+hcf);
        System.out.println("LCM would be "+lcm);
    }
}
