package DSAInterviewCourse.video.v09_conditional_and_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (true){


            System.out.print("Enter Operator : ");
            char ch = input.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){


                System.out.println("Enter Two numbers");
                int n1 = input.nextInt();
                int n2 = input.nextInt();


                if ( ch == '+'){
                    result = n1 + n2;
                }
                else if ( ch == '-'){
                    result = n1 - n2;
                }
                else if ( ch == '*'){
                    result = n1 * n2;
                }
                else if ( ch == '/'){
                    result = n1 / n2;
                }
                else if ( ch == '%'){
                    result = n1 % n2;
                }
            }

            else if (ch == 'X' || ch == 'x'){
                break;
            }
            else {
                System.out.println("invalid Operation");
            }
            System.out.println(result);
        }


    }
}
