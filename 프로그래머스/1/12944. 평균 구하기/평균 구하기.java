class Solution {
    public double solution(int[] arr) {
        double sub = 0;
        for(int num : arr) {
            sub += num;
        }
        return sub/arr.length;
    }
}