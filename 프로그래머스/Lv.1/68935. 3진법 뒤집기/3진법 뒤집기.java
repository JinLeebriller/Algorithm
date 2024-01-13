import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int 나눈값 = n;
        List<Integer> 나머지 = new ArrayList<>();

        while(나눈값 > 0) {
            나머지.add(나눈값 % 3);
            나눈값 = 나눈값 / 3;
        }

        for(int i = 나머지.size() - 1, j = 0 ; i >= 0 ; i--) {
            answer += 나머지.get(i) * Math.pow(3, j++);
        }

        return answer;
    }
}
