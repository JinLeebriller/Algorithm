class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] sCharArray = s.toCharArray();

        for(int i = 0 ; i < sCharArray.length ; i++) {
            if(97 <= sCharArray[i] && sCharArray[i] <= 122) {
                if ((char) (sCharArray[i] + n) > 122) {
                    sCharArray[i] = (char) (96 + ((sCharArray[i] + n) - 122));
                } else {
                    sCharArray[i] = (char) (sCharArray[i] + n);
                }
            }

            if(65 <= sCharArray[i] && sCharArray[i] <= 90) {
                if ((char) (sCharArray[i] + n) > 90) {
                    sCharArray[i] = (char) (64 + ((sCharArray[i] + n) - 90));
                } else {
                    sCharArray[i] = (char) (sCharArray[i] + n);
                }
            }

            answer += String.valueOf(sCharArray[i]);
        }

        return answer;
    }
}