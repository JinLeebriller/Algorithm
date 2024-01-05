class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000 + k * 2000;

        if(n >= 10) {
            answer = answer - (Integer.parseInt(String.valueOf(n).substring(0, String.valueOf(n).length() - 1)) * 2000);
        }

        return answer;
    }
}