import java.util.*;

class Solution {
    public String solution(int a, int b) {
        Map<Integer, String[]> months = new HashMap<>();
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int count = 5;

        for(int m = 1 ; m <= 12 ; m++) {
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                String[] days = new String[31];
                for (int d = 0 ; d < 31; d++, count++) {
                    if (count == 7) {
                        count = 0;
                    }
                    days[d] = week[count];
                }
                months.put(m, days);
            } else if(m == 2) {
                String[] days = new String[29];
                for (int d = 0 ; d < 29; d++, count++) {
                    if (count == 7) {
                        count = 0;
                    }
                    days[d] = week[count];
                }
                months.put(m, days);
            } else {
                String[] days = new String[30];
                for (int d = 0 ; d < 30; d++, count++) {
                    if (count == 7) {
                        count = 0;
                    }
                    days[d] = week[count];
                }
                months.put(m, days);
            }
        }

        return months.get(a)[b - 1];
    }
}