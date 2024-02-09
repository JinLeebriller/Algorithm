import java.util.StringTokenizer;

class Solution {
    public String solution(String my_string, String letter) {
        StringTokenizer st = new StringTokenizer(my_string, letter);
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }

        return sb.toString();
    }
}
