class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);

        for(int i = 0 ; i < words.length ; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            for(int j = 0 ; j < sb.length() ; j++) {
                sb.setCharAt(j, j % 2 == 0 ? Character.toUpperCase(sb.charAt(j)) : Character.toLowerCase(sb.charAt(j)));
            }
            words[i] = sb.toString();
            answer += words[i];
            if(i < words.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
}