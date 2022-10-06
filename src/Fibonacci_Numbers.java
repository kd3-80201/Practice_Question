public class Fibonacci_Numbers {
    public static void main(String[] args) {
        int a = 0;

        int b = 1;
        int d=1;
        System.out.print(0+" "+1+" ");
        while (d<5){
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(b+" ");
            d++;

        }



    }
}
