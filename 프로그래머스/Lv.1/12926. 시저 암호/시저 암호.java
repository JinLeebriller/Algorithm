class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0 ; i < sb.length() ; i++) {
            if(97 <= sb.charAt(i) && sb.charAt(i) <= 122) {
                sb.setCharAt(i, sb.charAt(i) + n <= 122 ? (char)(sb.charAt(i) + n) : (char)(96 + (sb.charAt(i) + n) - 122));
            } else if(65 <= sb.charAt(i) && sb.charAt(i) <= 90) {
                sb.setCharAt(i, sb.charAt(i) + n <= 90 ? (char)(sb.charAt(i) + n) : (char)(64 + (sb.charAt(i) + n) - 90));
            }
        }

        return sb.toString();
    }
}
