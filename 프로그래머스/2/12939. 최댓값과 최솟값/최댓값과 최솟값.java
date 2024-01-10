class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ");
        int maxValue = Integer.parseInt(sArray[0]);
        int minValue = Integer.parseInt(sArray[0]);

        for(String numStr : sArray) {
            int num = Integer.parseInt(numStr);
            if(num < minValue) {
                minValue = num;
            } else if(num > maxValue) {
                maxValue = num;
            }
        }

        return answer += minValue + " " + maxValue;
    }
}