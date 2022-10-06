public class Linear_Search_Algorithm2 {
    public static void main(String[] args) {
        String u = "Afnan";
        char r = 'a';
        System.out.println(something(u, r));
    }
    static boolean something(String na, char p ){
        if (na.length() == 0){
            return false;
        }
        for (int i = 0; i < na.length(); i++) {
            if ( p == na.charAt(i)){
                return true;
            }

        }
        return false;
    }
}

//for(char na : str.toCharArray()) { // Enhanced for each loop
//if (na == p) {
//return true;
//}
//}
//return false;
//}