package DSAInterviewCourse.assignments.ex_05_Arrays;

public class eg_04RichestCustomer {
    static int maximumWealth(int[][] accounts) {

        int [] wealth = new int[accounts.length];
        int m = accounts.length;
        int max = 0;
        for(int i = 0; i < m; i++){
            int n = accounts[i].length;
            for (int j = 0; j < n; j++){
                wealth[i] += accounts[i][j];
                if (wealth[i] > max){
                    max = wealth[i];
                }
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int [][] accounts = {
                {2, 1, 7},
                {7, 1, 3},
                {1, 9, 5},
        };
        System.out.println((maximumWealth(accounts)));
    }
}
