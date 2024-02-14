import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : works) {
            pq.offer(num);
        }

        for(int i = 0 ; i < n ; i++) {
            if(pq.peek() != 0) {
                max = pq.poll() - 1;
            } else {
                break;
            }
            pq.offer(max);
        }

        for(int i = 0 ; i < works.length ; i++) {
            answer += pq.peek() * pq.poll();
        }

        return answer;
    }
}
