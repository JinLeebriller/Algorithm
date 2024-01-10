class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ");
        int minValue, maxValue, num;
        minValue = maxValue = Integer.parseInt(sArray[0]);

        for(String numStr : sArray) {
            num = Integer.parseInt(numStr);
            if(minValue > num) {
                minValue = num;
            }
            if(maxValue < num) {
                maxValue = num;
            }
        }

        return answer += minValue + " " + maxValue;
    }
}