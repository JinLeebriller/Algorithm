import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0 ; i < quiz.length ; i++) {
            StringTokenizer st = new StringTokenizer(quiz[i], " ");

            int X = Integer.parseInt(st.nextToken());
            String operator = st.nextToken();
            int Y = Integer.parseInt(st.nextToken());
            String equal = st.nextToken();
            int Z = Integer.parseInt(st.nextToken());

            if(operator.equals("+")) {
                if(Z == X + Y) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(Z == X - Y) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}