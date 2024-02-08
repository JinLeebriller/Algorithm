class Solution {
    public int solution(int[] numbers, int k) {
        int answer, index, turn;
        answer = index = 0;
        turn = 1;

        while (turn != k) {
            turn++;
            index += 2;

            if(index >= numbers.length && index - (numbers.length - 1) == 1) {
                index = 0;
            } else if(index >= numbers.length && index - (numbers.length - 1) == 2) {
                index = 1;
            }

            answer = numbers[index];
        }

        return answer;
    }
}