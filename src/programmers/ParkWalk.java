package programmers;

public class ParkWalk {

    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                x = park[i].indexOf("S");
                y = i;
                break;
            }
        }

        System.out.println("x = " + x + " y = " + y);


        for (String route : routes) {
            String[] split = route.split(" ");
            String op = split[0];
            int n = Integer.parseInt(split[1]);

            boolean checker = true;

            for (String s : split) {
                System.out.println(s);
            }

            switch (op) {
                case "N":
                    if (y - n >= 0) {
                        for (int i = y; i >= y - n; i--) {
                            if (String.valueOf(park[i].charAt(x)).equals("X")) checker = false;
                        }
                        y = checker ? y - n : y;
                    }
                    break;
                case "S":
                    if (y + n < h) {
                        for (int i = y; i <= y + n; i++) {
                            if (String.valueOf(park[i].charAt(x)).equals("X")) checker = false;
                        }
                        y = checker ? y + n : y;
                    }
                    break;
                case "E":
                    if (x + n < w) {
                        for (int i = x; i <= x + n; i++) {
                            if (String.valueOf(park[y].charAt(i)).equals("X")) checker = false;
                        }
                        x = checker ? x + n : x;
                    }
                    break;
                case "W":
                    if (x - n >= 0) {
                        for (int i = x; i >= x - n; i--) {
                            if (String.valueOf(park[y].charAt(i)).equals("X")) checker = false;
                        }
                        x = checker ? x - n : x;
                    }
                    break;
            }
        }

        int[] answer = {y, x};

        return answer;
    }



}
