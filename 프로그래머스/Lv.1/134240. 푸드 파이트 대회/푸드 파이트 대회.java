class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i < food.length ; i++) {
            for(int j = 0 ; j < food[i]/2 ; j++) {
                sb.append(i);
            }
        }

        int reverse = sb.length() - 1;

        sb.append(0);

        for(int i = 0, j = reverse ; i <= reverse ; i++, j--) {
            sb.append(sb.charAt(j));
        }

        return sb.toString();
    }
}