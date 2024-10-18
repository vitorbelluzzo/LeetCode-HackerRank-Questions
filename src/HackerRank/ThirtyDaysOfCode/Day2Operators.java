package HackerRank.ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2Operators {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tipValue =  (tip_percent * meal_cost) / 100;
        double taxValue =  (tax_percent * meal_cost) / 100;
        double total = meal_cost + tipValue + taxValue;
        int integerTotal = (int) Math.round(total);
        System.out.println(integerTotal);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
        Day2Operators.solve(meal_cost, tip_percent, tax_percent);
        bufferedReader.close();
    }

}
