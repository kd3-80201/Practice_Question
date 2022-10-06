import java.util.Scanner;

public class assignment01 {
    public static void main(String[] args) {
        System.out.println("Enter year in YYYY format");
        Scanner sc= new Scanner(System.in);
        int yr = sc.nextInt();

        if (yr%2==0){
            System.out.println(yr+" It is a leap year");
        }
        else
            System.out.println(" It it not a leap year");
    }
}
