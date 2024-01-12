import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Integer> aliquot = new ArrayList<>();

        for(int i = 1 ; i <= brown + yellow ; i++) {
            if((brown + yellow) % i == 0) {
                aliquot.add(i);
            }
        }

        for(int i = aliquot.size() - 1, j = 0 ; i >= 0 ; i--, j++) {
            if((aliquot.get(i) - 2)*(aliquot.get(j) - 2) == yellow) {
                answer[0] = aliquot.get(j);
                answer[1] = aliquot.get(i);
            }
        }

        return answer;
    }
}