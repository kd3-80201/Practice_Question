import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();

//        switch (st){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("Red fruit");
//                break;
//            case "grapes":
//                System.out.println("Bunch of fruits");
//                break;
//            case "Guava && guava":
//                System.out.println("Taste like a jam");
//                break;
//            default:
//                System.out.println("you have entered wrong fruit");
//        }

        //Enhanced way
//        switch (st) {
//            case "Mango || mango" -> System.out.println("King of fruits");
//            case "Apple || apple" -> System.out.println("A sweet red fruit");
//            case "Orange || orange" -> System.out.println("Round fruit");
//            case "Grapes || grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("please enter a valid fruit");
//       }

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Afnan Baig");
//                break;
//            case 2:
//                System.out.println("Shoeb khan");
//                break;
//            case 3:
//                System.out.println("Saud Mirza");
//
//
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Computer":
//                        System.out.println("Computer Department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct impId");
//        }

        //Enhanced way
        switch (empID) {
            case 1 -> System.out.println("Afnan Baig");
            case 2 -> System.out.println("Shoeb khan");
            case 3 -> {
                System.out.println("Saud Mirza");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Computer" -> System.out.println("Computer Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct impId");
        }
    }
}
