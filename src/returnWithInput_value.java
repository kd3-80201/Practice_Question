import java.util.Scanner;

public class returnWithInput_value {
    public static void main(String[] args) {
//        int me =something(20,45);
//        System.out.println(me);
        String yes = say("Afnan Baig");
        System.out.println(yes);
    }
    static String say (String na){
       String message = "hello "+na;
        return message;
    }
    static  int something (int i , int k){
        int c;
        c = i+k;
        return c;


    }

}
