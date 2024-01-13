class Solution {
    public String solution(String s) {
        String[] sArray = s.split(" ");
        int minValue, maxValue, num;
        minValue = maxValue = Integer.parseInt(sArray[0]);

        for(String numStr : sArray) {
            num = Integer.parseInt(numStr);
            if(minValue > num) {
                minValue = num;
            } else if(maxValue < num){
                maxValue = num;
            }
        }

        return minValue + " " + maxValue;
    }
}
