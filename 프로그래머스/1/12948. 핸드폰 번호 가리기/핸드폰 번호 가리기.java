class Solution {
    public String solution(String phone_number) {
        String before = phone_number.substring(phone_number.length() - 4);
        String after = "";
        
        for(int i = 0 ; i < phone_number.length() - 4 ; i++) {
            after += "*";
        }
        
        return after + before;
    }
}