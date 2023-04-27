package backjoon;

import java.util.Scanner;

public class No2903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dotSize = 2;

        for (int i = 0; i<n; i++) {
            dotSize += dotSize - 1;
        }
        System.out.println(dotSize * dotSize);
    }

}
