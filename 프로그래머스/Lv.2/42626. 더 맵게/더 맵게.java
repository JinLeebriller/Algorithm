import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer, mixedScoville, minNum, secondMinNum;
        answer = mixedScoville = minNum = secondMinNum = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for(int num : scoville) {
            pQ.offer(num);
        }

        while(pQ.peek() < K) {
            for(int i = 0 ; i < 2 ; i++) {
                if(i == 0 && pQ.peek() != null) {
                    minNum = pQ.poll();
                } else if(i == 1 && pQ.peek() != null) {
                    secondMinNum = pQ.poll();
                } else {
                    return -1;
                }
            }
            mixedScoville = minNum + secondMinNum * 2;
            pQ.offer(mixedScoville);
            answer++;
        }

        return answer;
    }
}
