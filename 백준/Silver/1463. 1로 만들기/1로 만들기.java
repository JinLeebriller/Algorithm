import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int[] dp = new int[X + 1];
        dp[1] = 0;

        for (int i = 2; i < X + 1; i++) {
            if(i % 6 == 0) {
                dp[i] = Math.min(Math.min(dp[i - 1] + 1, dp[i / 3] + 1), dp[i / 2] + 1);
            } else if(i % 3 == 0) {
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 3] + 1);
            } else if(i % 2 == 0) {
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        bw.write(dp[X] + "");
        bw.flush();
    }
}