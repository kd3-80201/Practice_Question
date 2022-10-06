import java.util.Scanner;

public class assignment04_2 {
    public static void main(String[] args) {
        int a,b,i,l,lcm;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        l = Math.max(a, b);
        for (i = l; i <a*b; i+=l) {
            if (i%a==0 && i%b==0){
                break;
            }
        }
        lcm = i;
        System.out.println("LCM will be "+lcm);
    }
}
