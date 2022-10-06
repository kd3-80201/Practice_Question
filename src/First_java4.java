import java.util.Scanner;

public class First_java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans;
        System.out.println("select the operator +,-,*,/");
        String c = sc.next();

        if (c.equals("+")|| c.equals("/") || c.equals("-") || c.equals("*")){
//        if (Objects.equals(c, "+") || Objects.equals(c, "-") || Objects.equals(c, "*") || Objects.equals(c, "/")){

            System.out.println("Input First Number");
            double a = sc.nextDouble();

            System.out.println("Input Second Number");
            double b = sc.nextDouble();

             if (c.equals("+")){
                ans = a + b;
                //System.out.println(ans);
            } else if (c.equals("-")) {
                ans = a - b;
                //System.out.println(ans);
            }
            else if (c.equals("*")){
                ans = a * b;
               // System.out.println(ans);
            }
            else {
                ans = a / b;
                // System.out.println(ans);
            }
            System.out.println(ans);
        }
        else
            System.out.println("Choose the Appropriate Operator");
    }
}
