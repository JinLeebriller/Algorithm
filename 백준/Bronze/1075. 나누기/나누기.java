import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strN = br.readLine();
        int N = Integer.parseInt(strN) - Integer.parseInt(strN.substring(strN.length() - 2));
        int F = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < 100 ; i++) {
            if((N + i) % F == 0) {
                System.out.printf("%02d", i);
                break;
            }
        }
    }
}