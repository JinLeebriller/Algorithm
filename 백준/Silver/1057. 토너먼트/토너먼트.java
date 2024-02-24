import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansoo = Integer.parseInt(st.nextToken());
        int round = 1;

        while(N > 0) {
            if(jimin < hansoo && jimin % 2 == 1 && hansoo - jimin == 1 || hansoo < jimin && hansoo % 2 == 1 && jimin - hansoo == 1) break;
            N = N/2;
            round++;
            if(jimin % 2 == 0) jimin = jimin / 2;
            else jimin = 1 + jimin / 2;
            if(hansoo % 2 == 0) hansoo = hansoo / 2;
            else hansoo = 1 + hansoo / 2;
        }

        bw.write(round + "");
        bw.flush();
    }
}