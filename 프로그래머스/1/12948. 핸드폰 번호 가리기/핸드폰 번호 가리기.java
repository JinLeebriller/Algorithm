class Solution {
    public String solution(String phone_number) {
        char[] number = phone_number.toCharArray();

        for(int i = 0 ; i < phone_number.length() - 4 ; i++) {
            number[i] = '*';
        }

        return String.valueOf(number);
    }
}