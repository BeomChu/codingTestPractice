package programmers;

import java.util.*;

public class DaeChoong {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> indexMap =new HashMap<>(); //String -> Character 변경

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                indexMap.put(c, Math.min(indexMap.getOrDefault(c, 1000), i+1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            answer[i] = 0;
            for (char c : targets[i].toCharArray()) {
                if (indexMap.containsKey(c)) {
                    answer[i] += indexMap.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
