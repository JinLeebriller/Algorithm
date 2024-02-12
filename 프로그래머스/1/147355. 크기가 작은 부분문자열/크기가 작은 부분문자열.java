class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int beginIndex = 0;
        int endIndex = p.length();

        while(endIndex <= t.length()) {
            long intT = Long.parseLong(t.substring(beginIndex, endIndex));

            if(intT <= Long.parseLong(p)) {
                answer++;
            }

            beginIndex++;
            endIndex++;
        }

        return answer;
    }
}