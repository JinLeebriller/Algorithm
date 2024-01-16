class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] yesICanDo = {"aya", "ye", "woo", "ma"};

        out: for(int i = 0 ; i < babbling.length ; i++) {
            StringBuilder sb = new StringBuilder(babbling[i]);
            for(int  j = 0 ; j < yesICanDo.length ; j++) {
                if(sb.indexOf(yesICanDo[j]) != -1) {
                    int l = sb.indexOf(yesICanDo[j]);
                    for(int k = l ; k < l + yesICanDo[j].length() ; k++) {
                        sb.setCharAt(k, '1');
                    }
                }
            }
            for(int j = 0 ; j < sb.length() ; j++) {
                if(sb.charAt(j) != '1') {
                    continue out;
                }
            }
            answer++;
        }

        return answer;
    }
}