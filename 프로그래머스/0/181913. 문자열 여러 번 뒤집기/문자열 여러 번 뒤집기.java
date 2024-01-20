class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < queries.length ; i++) {
            str.append(sb.substring(queries[i][0], queries[i][1] + 1));
            for(int j = str.length() - 1, k = queries[i][0] ; j >= 0 ; j--, k++) {
                sb.setCharAt(k, str.charAt(j));
            }
            str.setLength(0);
        }

        return sb.toString();
    }
}