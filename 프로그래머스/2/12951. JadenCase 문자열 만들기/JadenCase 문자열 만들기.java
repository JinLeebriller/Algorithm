class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ", -1);

        for(int i = 0 ; i < sArray.length ; i++) {
            StringBuilder sb = new StringBuilder(sArray[i]);
            if(sb.length() != 0 && sb.charAt(0) >= 48 && sb.charAt(0) <= 57) {
                for(int j = 1 ; j < sb.length() ; j++) {
                    sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                }
            } else if(sb.length() != 0 && sb.charAt(0) != '\0') {
                for(int j = 0 ; j < sb.length() ; j++) {
                    if(j == 0) {
                        sb.setCharAt(j, Character.toUpperCase(sb.charAt(j)));
                    } else {
                        sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                    }
                }
            }
            answer += sb.toString();
            if(i < sArray.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
}