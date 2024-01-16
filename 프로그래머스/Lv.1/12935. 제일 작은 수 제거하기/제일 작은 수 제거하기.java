import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        int min = arr[0];
        int minIndex = 0;
        int[] newArr;
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            arrList.add(arr[i]);
            if(arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        arrList.remove(minIndex);

        if(arr.length != 1) {
            newArr = new int[arrList.size()];
            for(int i : arrList) {
                newArr[count] = i;
                count++;
            }
        } else {
            return newArr = new int[] {-1};
        }

        return newArr;
    }
}