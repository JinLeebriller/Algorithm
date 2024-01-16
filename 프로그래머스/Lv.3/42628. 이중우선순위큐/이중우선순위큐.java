import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        List<Integer> numList = new ArrayList<>();
        int min, max;
        min = max = 0;

        for(String instruction : operations) {
            switch (instruction.charAt(0)) {
                case 'I' :
                    numList.add(Integer.parseInt(instruction.substring(2)));
                    if(numList.size() == 1) {
                        min = max = Integer.parseInt(instruction.substring(2));
                    }
                    for(int i = 0 ; i < numList.size() ; i++) {
                        int num = numList.get(i);
                        if(num < min) {
                            min = num;
                        } else if(num > max) {
                            max = num;
                        }
                    }
                    break;
                case 'D' :
                 if(!numList.isEmpty() && instruction.charAt(2) == '1') {
                    for(int i = numList.size() - 1; i >= 0 ; i--) {
                        int num = numList.get(i);
                        if(num == max) {
                            numList.remove(i);
                        }
                    }
                    if(!numList.isEmpty()) {
                        int num = numList.get(0);
                        for (int i = 0; i < numList.size(); i++) {
                            if (num <= numList.get(i)) {
                                num = numList.get(i);
                                max = num;
                            }
                        }
                    }
                } else if(!numList.isEmpty() && instruction.charAt(2) == '-') {
                    for(int i = numList.size() - 1; i >= 0 ; i--) {
                        int num = numList.get(i);
                        if(num == min) {
                            numList.remove(i);
                        }
                    }
                    if(!numList.isEmpty()) {
                        int num = numList.get(0);
                        for (int i = 0; i < numList.size(); i++) {
                            if (num >= numList.get(i)) {
                                num = numList.get(i);
                                min = num;
                            }
                        }
                    }
                }
            }
            if(numList.isEmpty()) {
                min = max = 0;
            }
        }

        return new int[] {max, min};
    }
}