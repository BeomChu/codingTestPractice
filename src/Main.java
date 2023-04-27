import backjoon.No2903;
import programmers.MemoryScore;
import programmers.ParkWalk;
import programmers.Race;

public class Main {
    public static void main(String[] args) {
        MemoryScore ms = new MemoryScore();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] solution = ms.solution(name, yearning, photo);
        for (int i : solution) {
            System.out.println(i);
        }


    }
}