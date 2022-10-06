import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char ch= sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <+ 'z')
        {
            System.out.println("it is a small letter");
        }
        else
            System.out.println("it is a capital letter");
    }
}
