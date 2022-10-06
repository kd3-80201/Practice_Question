import java.util.Scanner;

public class Switch_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mo = sc.nextLine();
        String si = sc.nextLine();

        switch (mo){
            case "Iron Man", "Hulk", "Captain America" -> {
                System.out.println("Marvel");
                switch (si) {
                    case "Lucifer", "Breaking Bad", "Better Call Saul" -> System.out.println("Netflix Shows");
                    case "The Boys","Lord of the rings" -> System.out.println("Amazon Prime");
                }
            }
            case "Bat man","cat woman","super Man" -> {

                System.out.println("DC");
                switch (si) {
                    case "Lucifer", "Breaking Bad", "Better Call Saul" -> System.out.println("Netflix Shows");
                    case "The Boys","Lord of the rings" -> System.out.println("Amazon Prime");
                }
            }
            default -> System.out.println("Enter a valid character");
        }
    }
}
