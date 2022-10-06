import java.util.Scanner;

public class assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uu= sc.nextInt();
        int n =1;
        while (n<11)
        {

            System.out.println(uu+"*"+n+"="+uu*n);
            n++;
        }
    }
}
