package DSAInterviewCourse.video.switchStatement;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int emp = scanner.nextInt();
        String dep = scanner.next();

//        switch (emp){
//            case 1:
//                System.out.println("Rahul Rana");
//                break;
//            case 2:
//                System.out.println("Abu Huzaifa");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (dep){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Coder":
//                        System.out.println("Coder Department");
//                        break;
//                    default:
//                        System.out.println("Enter valid Department");
//                }
//                break;
//            default:
//                System.out.println("Enter Valid Emp-ID");
//        }

//      Inhanced Switch case
//        switch (emp) {
//            case 1 -> System.out.println("Rahul Rana");
//            case 2 -> System.out.println("Abu Huzaifa");
//            case 3 -> {
//                System.out.println("Emp Number 3");
//                switch (dep) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Coder":
//                        System.out.println("Coder Department");
//                        break;
//                    default:
//                        System.out.println("Enter valid Department");
//                }
//            }
//            default -> System.out.println("Enter Valid Emp-ID");
//        }


//      witch case to if else 
        if (emp == 1) {
            System.out.println("Rahul Rana");
        } else if (emp == 2) {
            System.out.println("Abu Huzaifa");
        } else if (emp == 3) {
            System.out.println("Emp Number 3");
            switch (dep) {
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Coder":
                    System.out.println("Coder Department");
                    break;
                default:
                    System.out.println("Enter valid Department");
            }
        } else {
            System.out.println("Enter Valid Emp-ID");
        }

    }
}
