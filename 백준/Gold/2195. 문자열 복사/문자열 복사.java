import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        String S = br.readLine();
        String P = br.readLine();

        for(int i = 0 ; i < P.length() ; i++) {
            if(i == P.length() - 1) {
                answer++;
                break;
            }
            for(int j = i + 1 ; j <= P.length() ; j++) {
                if(!S.contains(P.substring(i, j))) {
                    answer++;
                    i += P.substring(i, j).length() - 2;
                    break;
                }
            }
        }

        bw.write(answer + "\n");
        bw.flush();
    }
}