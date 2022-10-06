import java.util.Random;

public class motorolla
{

    public static void main(String []args)
    {
        Random r = new Random();
        int b, a;

            for (b = 1; b <= 10; )
            {
                a = r.nextInt(100) ;
                if (a%10==0)
                {
                    System.out.println(a*-1);
                    b++;
                }
            }

    }
}