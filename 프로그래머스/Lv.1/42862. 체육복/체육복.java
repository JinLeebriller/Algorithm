import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Set<Integer> lostSet = new TreeSet<>();
        Set<Integer> reserveSet = new TreeSet<>();

        for(int i = 0 ; i < lost.length ; i++) {
                lostSet.add(lost[i]);
            for(int j = 0 ; j < reserve.length ; j++) {
                if(lost[i] == reserve[j]) {
                    lostSet.remove(lost[i]);
                    answer++;
                }
            }
        }

        for(int i = 0 ; i < reserve.length ; i++) {
            reserveSet.add(reserve[i]);
            for(int j = 0 ; j < lost.length ; j++) {
                if(reserve[i] == lost[j]) {
                    reserveSet.remove(reserve[i]);
                }
            }
        }

        List<Integer> lostList = new ArrayList<>(lostSet);
        List<Integer> reserveList = new ArrayList<>(reserveSet);

        for(int i = 0 ; i < reserveList.size() ; i++) {
            for(int j = 0 ; j < lostList.size() ; j++) {
                if(reserveList.get(i) + 1 == lostList.get(j) || reserveList.get(i) - 1 == lostList.get(j)) {
                    answer++;
                    lostList.remove(j);
                }
            }
        }

        return answer;
    }
}