import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < answer.length ; i++) {
            int[] newArr = new int[commands[i][1] - commands[i][0] + 1];

            for(int j = 0, k = commands[i][0] - 1 ; j < newArr.length ; j++, k++) {
                newArr[j] = array[k];
            }

            Arrays.sort(newArr);
            answer[i] = newArr[commands[i][2] - 1];
        }

        return answer;
    }
}