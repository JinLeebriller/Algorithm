class Solution {
    public int solution(int[] common) {
        for(int k = 0 ; k < common.length ; k++) {
            if (common[k] == 0) {
                return common[common.length - 1] += common[2] - common[1];
            }
        }

        if(common[2] % common[1] != 0) {
            return common[common.length - 1] += common[2] - common[1];
        }
        return common[common.length - 1] * (common[2] / common[1]);
    }
}