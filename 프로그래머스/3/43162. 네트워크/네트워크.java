import java.util.Stack;

class Solution {
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < n ; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i, computers, n, stack);
            }
        }

        return answer;
    }
    
    void dfs(int depth, int[][] computers, int n, Stack<Integer> stack) {
        visited[depth] = true;
        stack.push(depth);

        while(!stack.isEmpty()) {
            stack.pop();

            for(int i = 0 ; i < n ; i++) {
                if(!visited[i] && computers[i][depth] != 0) {
                    dfs(i, computers, n, stack);
                }
            }
        }
    }
}