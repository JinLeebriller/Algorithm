import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temp = "";
        char[] aChar = A.toCharArray();
        List<Character> arr = new LinkedList<>();

        for(int i = 0 ; i < aChar.length ; i++) {
            arr.add(aChar[i]);
        }

        while(true) {
            for(int j = 0 ; j < arr.size() ; j++) {
                temp += arr.get(j);
            }

            if(temp.equals(B)) {
                break;
            } else {
                temp = "";
            }

            if(answer == arr.size() - 1) {
                return -1;
            }

            arr.add(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);
            answer++;
        }

        return answer;
    }
}