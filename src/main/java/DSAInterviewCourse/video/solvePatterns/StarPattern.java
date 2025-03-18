package DSAInterviewCourse.video.solvePatterns;

public class StarPattern {
    public static void main(String[] args) {


        pattern7(5);


    }

    private static void pattern7(int n) {

    }

    private static void pattern6(int n) {
        for (int r = 1; r <= n * 2; r++) {
            int totalColinRow = r > n ? 2 * n - r : r;
            for (int c = 1; c <= totalColinRow; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightTrianglePattern(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void leftTrianglePattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void squarePattern(int num) {
        for (int rows = 0; rows < num; rows++) {
            for (int cols = 0; cols < num; cols++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }


}
