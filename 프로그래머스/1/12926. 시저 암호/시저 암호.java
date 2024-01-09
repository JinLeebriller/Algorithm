import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] sCharArray = s.toCharArray();
        List<Character> lowerCase = new ArrayList<>();
        List<Character> upperCase = new ArrayList<>();

        for(int i = 0, j = 97, k = 65 ; i < 26 ; i++, j++, k++) {
            lowerCase.add((char)j);
            upperCase.add((char)k);
        }

        for(int i = 0 ; i < sCharArray.length ; i++) {
            if(lowerCase.contains(sCharArray[i])) {
                if((char)(sCharArray[i] + n) > 122) {
                    sCharArray[i] = (char)(96 + ((sCharArray[i] + n) - 122));
                } else {
                    sCharArray[i] = (char)(sCharArray[i] + n);
                }
            } else if(upperCase.contains(sCharArray[i])) {
                if((char)(sCharArray[i] + n) > 90) {
                    sCharArray[i] = (char)(64 + ((sCharArray[i] + n) - 90));
                } else {
                    sCharArray[i] = (char)(sCharArray[i] + n);
                }
            }
            answer += String.valueOf(sCharArray[i]);
        }

        return answer;
    }
}