import programmers.Race;

public class Main {
    public static void main(String[] args) {

        Race race = new Race();

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        String[] solution = race.solution(players, callings);
        for (String s : solution) {
            System.out.println(s);
        }

    }
}