import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(arr[0]);
        int preNum = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i] != preNum) {
                arrList.add(arr[i]);
                preNum = arr[i];
            }
        }

        int[] answer = new int[arrList.size()];
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
