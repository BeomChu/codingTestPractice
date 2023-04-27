package programmers;

import java.util.Arrays;

public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i =0; i<photo.length; i++) {
            int score = 0;

            for (String model : photo[i]) {
                if (Arrays.asList(name).contains(model)) {
                    score += yearning[Arrays.asList(name).indexOf(model)];
                }
            }
            answer[i] = score;
        }

        return answer;
    }
}
