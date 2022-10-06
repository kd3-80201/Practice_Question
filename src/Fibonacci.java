import java.util.Scanner;

public class Fibonacci { //To find the Nth fibonacci Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count =2;
        //System.out.print(0+" "+1+" ");
        while (count <= n){ // true n=2
            int temp = b;
            b = b+a;
            a = temp;
            count ++;
        }
        System.out.print(b+" ");
    }
}
