class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int i = 0 ; i < array.length ; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(array[i]));
            for(int j = 0 ; j < sb.length() ; j++) {
                if(sb.charAt(j) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}