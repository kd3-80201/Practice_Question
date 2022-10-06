import java.util.Scanner;

public class First_java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na = sc.next().trim();
        String t = na.concat(na);
       // String st = String.valueOf(na.concat(na); //Well i was trying to print my surname too but can't find the way through
        //System.out.println(t);
        System.out.println("Hello "+na+" we welcome you");
    }
}
