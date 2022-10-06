public class Trying_FunctionProblem02 {
    public static void main(String[] args) {
        String ans = naam();
        System.out.println(ans);
        String likh = "haan";
        naam();
        System.out.println(likh);
//        int vc = change(10,50);
//        System.out.println(vc);
    }

     static String naam() {
         String naam = "kuch to likh be"; //this return is not going to use because the original likh which is "haan" is going to print
         return naam;
    }

//    static int change(int a , int b) {
//        int c = a + b;
//        return c;
//    }
}
