class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];

        for(int i = 0 ; i < triangle.length ; i++) {
            dp[i] = new int[triangle[i].length];
            for(int j = 0 ; j < triangle[i].length ; j++) {
                dp[i][j] = triangle[i][j];
            }
        }

        for(int i = 1 ; i < triangle.length ; i++) {
            for(int j = 0 ; j < triangle[i].length - 1 ; j++) {
                for(int k = 0 ; k < 2 ; k++) {
                    int comparison = dp[i - 1][j] + triangle[i][j + k];
                    dp[i][j + k] = Math.max(comparison, dp[i][j + k]);
                }
            }
        }

        int answer = dp[dp.length - 1][0];

        for(int i = 0 ; i < dp[dp.length-1].length ; i++) {
            answer = Math.max(dp[dp.length - 1][i], answer);
        }

        return answer;
    }
}
