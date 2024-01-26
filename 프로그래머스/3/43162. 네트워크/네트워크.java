import java.util.*;

class Solution {
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i = 0 ; i < n ; i++) {
            if(!visited[i]) {
                answer++;
                bfs(i, computers, n);
            }
        }

        return answer;
    }
    
    void bfs(int depth, int[][] computers, int n) {
        visited[depth] = true;
        queue.offer(depth);

        while(!queue.isEmpty()) {
            int w = queue.poll();

            for(int i = 0 ; i < n ; i++) {
                if(!visited[i] && computers[w][i] != 0) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}