class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(s + overwrite_string.length());
        String after = my_string = my_string.replaceAll(my_string.substring(s), overwrite_string);
        return after + before;
    }
}
