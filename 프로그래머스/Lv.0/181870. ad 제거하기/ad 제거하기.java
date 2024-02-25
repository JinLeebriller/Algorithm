class Solution {
    public String[] solution(String[] strArr) {
        String word = "";

        for(int i = 0 ; i < strArr.length ; i++) {
            if(!strArr[i].contains("ad")) {
                word += strArr[i] + ",";
            }
        }

        String[] answer = word.split(",");

        return answer;
    }
}
