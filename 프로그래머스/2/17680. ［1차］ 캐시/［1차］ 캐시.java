import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for(int i = 0 ; i < cities.length ; i++) {
            if(cache.size() == cacheSize + 1) {
                cache.removeLast();
            }
            if(cache.contains(cities[i].toLowerCase())) {
                cache.remove(cities[i].toLowerCase());
                cache.addFirst(cities[i].toLowerCase());
                answer += 1;
            }
            if(!cache.contains(cities[i].toLowerCase())) {
                cache.addFirst(cities[i].toLowerCase());
                answer += 5;
            }
        }

        return answer;
    }
}