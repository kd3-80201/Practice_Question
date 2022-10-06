import java.util.Random;

public class daud {
    public static void main(String[]args)
    {
        Random r=new Random();
        int b,a;
        for (b=1; b<=10; b++)
        {
            a=r.nextInt(10)+75;
            System.out.println(a);
        }
    }

}
