import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] student = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        Map<Integer, Integer> studentMap = new HashMap<>();
        studentMap.put(1, 0);
        studentMap.put(2, 0);
        studentMap.put(3, 0);

        for(int i = 0, s1 = 0, s2 = 0, s3 = 0 ; i < answers.length ; i++, s1++, s2++, s3++) {
            if(s1 == student[0].length) s1 = 0;
            if(s2 == student[1].length) s2 = 0;
            if(s3 == student[2].length) s3 = 0;

            if(answers[i] == student[0][s1]) studentMap.put(1, studentMap.get(1) + 1);
            if(answers[i] == student[1][s2]) studentMap.put(2, studentMap.get(2) + 1);
            if(answers[i] == student[2][s3]) studentMap.put(3, studentMap.get(3) + 1);
        }

        int temp = studentMap.get(1);
        List<Integer> highScore = new ArrayList<>();

        for(int i = 1 ; i <= studentMap.size() ; i++) {
            if(temp < studentMap.get(i)) {
                temp = studentMap.get(i);
                highScore.removeAll(highScore);
                highScore.add(i);
            } else if(temp == studentMap.get(i)) {
                highScore.add(i);
            }
        }

        int[] answer = new int[highScore.size()];

        for(int i = 0 ; i < highScore.size() ; i++) {
            answer[i] = highScore.get(i);
        }

        return answer;
    }
}