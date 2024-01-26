class Solution {
    static boolean[] visited;

    // dfs - 재귀함수 사용
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i = 0 ; i < n ; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i, computers, n);
            }
        }

        return answer;
    }

    static void dfs(int depth, int[][] computers, int n) {
        visited[depth] = true;

        for(int i = 0 ; i < n ; i++) {
            if(!visited[i] && computers[i][depth] != 0) {
                dfs(i, computers, n);
            }
        }
    }
}