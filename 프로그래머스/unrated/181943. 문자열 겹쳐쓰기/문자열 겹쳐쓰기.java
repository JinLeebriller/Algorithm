class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String surplus = "";

        surplus = my_string.substring(s + overwrite_string.length());
        my_string = my_string.replaceAll(my_string.substring(s), overwrite_string);
        answer += my_string + surplus;

        return answer;
    }
}