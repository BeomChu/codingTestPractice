package programmers;

import java.util.HashMap;
import java.util.Map;

public class Race {
        public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> rankMap = new HashMap<>();

            for (int i = 0; i < players.length; i++) {
                rankMap.put(players[i], i);
            }

            for (String called : callings) {
                int i = rankMap.get(called);
                players[i] = players[i-1];
                players[i-1] = called;

                rankMap.put(players[i], i);
                rankMap.put(players[i-1], i-1);
            }

            return players;
    }
}


