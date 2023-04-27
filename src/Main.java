import programmers.ParkWalk;
import programmers.Race;

public class Main {
    public static void main(String[] args) {

        ParkWalk pw = new ParkWalk();
        String[] park = {"OOO", "OSO", "OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        int[] solution = pw.solution(park, routes);
        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }
}