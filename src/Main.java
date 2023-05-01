import backjoon.No2903;
import programmers.DaeChoong;
import programmers.MemoryScore;
import programmers.ParkWalk;
import programmers.Race;

public class Main {
    public static void main(String[] args) {
        DaeChoong dc = new DaeChoong();

        String[] keymap = {"BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ","BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ","BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ","BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ","BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ","BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ","BCEFD","BCEFD","BCEFDZZ","BCEFDZZ","BCEFDZZ"};
        String[] targets = {"BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ","BCEFDZZZ", "XXXXXZXXXXX"};

        int[] solution = dc.solution(keymap, targets);



        for (int i : solution) {
            System.out.println(i);
        }


    }
}