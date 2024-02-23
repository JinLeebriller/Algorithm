import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] files = new String[N];

        for(int i = 0 ; i < N ; i++) {
            files[i] = br.readLine();
        }

        for(int i = 0 ; i < files[0].length() ; i++) {
            sb.append(files[0].charAt(i));
            for(int j = 0 ; j < files.length ; j++) {
                if(files[0].charAt(i) != files[j].charAt(i)) {
                    sb.setCharAt(i, '?');
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}