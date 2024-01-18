import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] students = {0, 0, 0};
        int[][] studentsAnswers = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        for(int i = 0, s1 = 0, s2 = 0, s3 = 0 ; i < answers.length ; i++, s1++, s2++, s3++) {
            if(s1 == studentsAnswers[0].length) s1 = 0;
            if(s2 == studentsAnswers[1].length) s2 = 0;
            if(s3 == studentsAnswers[2].length) s3 = 0;

            if(answers[i] == studentsAnswers[0][s1]) students[0]++;
            if(answers[i] == studentsAnswers[1][s2]) students[1]++;
            if(answers[i] == studentsAnswers[2][s3]) students[2]++;
        }

        int temp = 0;
        List<Integer> highScore = new ArrayList<>();

        for(int i = 0 ; i <= 2 ; i++) {
            if(temp < students[i]) {
                temp = students[i];
                highScore.removeAll(highScore);
                highScore.add(i + 1);
            } else if(temp == students[i]) {
                highScore.add(i + 1);
            }
        }

        int[] answer = new int[highScore.size()];

        for(int i = 0 ; i < highScore.size() ; i++) {
            answer[i] = highScore.get(i);
        }

        return answer;
    }
}
