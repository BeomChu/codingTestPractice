package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No2720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        for (int i = 0; i < count; i++) {
            int change = Integer.parseInt(br.readLine());
            quarter = change/25;
            dime = (change - (quarter * 25)) / 10;
            nickel = (change - (quarter * 25) - (dime * 10)) / 5;
            penny = (change - (quarter * 25) - (dime * 10) - (nickel * 5));

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
