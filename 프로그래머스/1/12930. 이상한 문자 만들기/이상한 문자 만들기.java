class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);

        for(int i = 0 ; i < words.length ; i++) {
            StringBuilder sb = new StringBuilder(words[i]);

            for(int j = 0 ; j < sb.length() ; j++) {
                if (j % 2 == 0) {
                    sb.setCharAt(j, Character.toUpperCase(sb.charAt(j)));
                } else {
                    sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                }
            }

            words[i] = sb.toString();
        }

        for(int i = 0 ; i < words.length ; i++) {
            if(i < words.length - 1) {
                answer += words[i] + " ";
            } else if(i == words.length - 1) {
                answer += words[i];
            }
        }

        return answer;
    }
}