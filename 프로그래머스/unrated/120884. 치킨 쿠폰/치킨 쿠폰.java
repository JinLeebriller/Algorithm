class Solution {
    public int solution(int chicken) {
        int service = 0;
        int temp = chicken / 10;
        int coupon = Integer.parseInt(String.valueOf(chicken).substring(String.valueOf(chicken).length() - 1));

        while (temp > 0) {
            coupon += Integer.parseInt(String.valueOf(temp).substring(String.valueOf(temp).length() - 1));
            if (coupon >= 10) {
                service++;
                coupon = coupon - 10 + 1;
            }
            service += temp;
            temp = temp / 10;
        }

        return service;
    }
}