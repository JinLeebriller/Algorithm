class Solution {
    public int solution(int num) {
        int answer = 0;
        long longNum = (long)num;

        while(longNum != 1) {
            if(longNum % 2 == 0) {
                longNum = longNum / 2;
                answer++;
            } else {
                longNum = longNum * 3 + 1;
                answer++;
            }

            if(answer == 500) {
                return -1;
            }
        }

        return answer;
    }
}