class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder(code);

        for(int i = 0 ; i < code.length() ; i++) {
            if(i % q == r) {
                answer += sb.charAt(i);
            }
        }

        return answer;
    }
}