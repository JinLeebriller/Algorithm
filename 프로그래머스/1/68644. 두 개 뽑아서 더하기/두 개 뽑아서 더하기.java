import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> number = new TreeSet<>();
        
        for(int i = 0 ; i < numbers.length - 1 ; i++) {
            for(int j = i + 1 ; j < numbers.length ; j++) {
                number.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[number.size()];
        Iterator<Integer> iterator = number.iterator();

        for(int i = 0 ; i < number.size(); i++) {
            answer[i] = iterator.next();
        }

        return answer;
    }
}