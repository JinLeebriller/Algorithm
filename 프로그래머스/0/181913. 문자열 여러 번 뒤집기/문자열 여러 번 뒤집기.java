class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for(int i = 0 ; i < queries.length ; i++) {
            String str = sb.substring(queries[i][0], queries[i][1] + 1);
            for(int j = str.length() - 1, k = queries[i][0] ; j >= 0 ; j--, k++) {
                sb.setCharAt(k, str.charAt(j));
            }
        }

        return sb.toString();
    }
}