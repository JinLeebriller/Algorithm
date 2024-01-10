class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        StringBuilder sb = new StringBuilder(s);

        if(sb.length() == 4 || sb.length() == 6) {
            for(int i = 0 ; i < sb.length() ; i++) {
                if(sb.charAt(i) < 48 || sb.charAt(i) > 57) {
                    answer = false;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }
}