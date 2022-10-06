import java.util.Scanner;

public class First_java8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b  = 1;
        int count = 3;
        System.out.print("0 "+"1 ");
        while (count<=num){
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b+" ");
            count++;
        }
    }
}
