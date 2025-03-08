package DSAInterviewCourse.video.Linear_SearchAlgorithm;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {2, 3, 4},
                {3, 4, 5}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }



    static int maximumWealth(int[][] accounts ){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }

            if (sum > ans){
                ans = sum;
            }

        }
        return ans;

    }
}
