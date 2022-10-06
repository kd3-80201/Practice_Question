import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int count =0;
        while (a !=0){
            int b = a%10;
            count = count*10+b;
            a = a/10;
        }
        System.out.println(count);
    }
}
