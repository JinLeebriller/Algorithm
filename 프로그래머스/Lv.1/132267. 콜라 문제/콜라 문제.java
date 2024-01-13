class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int temp = 0;
            temp = b * (n / a);
            answer += temp;
            n = n - (n / a * a) + temp;
        }

        return answer;
    }
}
