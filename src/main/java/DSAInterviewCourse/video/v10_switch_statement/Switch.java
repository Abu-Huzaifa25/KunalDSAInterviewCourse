package DSAInterviewCourse.video.v10_switch_statement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String input = scanner.next();

//        switch (input){
//            case "Mango":
//                System.out.println("The king of fruit");
//                break;
//            case "Apple" :
//                System.out.println("Red sweet fruit");
//                break;
//            case "Banana":
//                System.out.println("Yellow sweet fruit");
//                break;
//            default:
//                System.out.println("Enter Valid fruit name");
//        }

//        switch (input) {
//            case "Mango" -> System.out.println("The king of fruit");
//            case "Apple" -> System.out.println("Red sweet fruit");
//            case "Banana" -> System.out.println("Yellow sweet fruit");
//            default -> System.out.println("Enter Valid fruit name");
//        }

        int day = scanner.nextInt();

//        switch (day){
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6,7 -> System.out.println("Weekend");
//            default -> System.out.println("Enter Valid day");
//        }

        // ---switch to If else

//        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
//            System.out.println("Weekday");
//        } else if (day == 6 || day == 7) {
//            System.out.println("Weekend");
//        } else {
//            System.out.println("Enter Valid day");
//        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter Valid day");
                break;
        }

    }
}