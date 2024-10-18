package HackerRank.ThirtyDaysOfCode;

import java.util.*;

public class Day1DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int secondInteger = scan.nextInt();
        double secondDouble = scan.nextDouble();
        scan.nextLine();
        String secondPhrase = scan.nextLine();
        System.out.println(i + secondInteger);
        System.out.println(d + secondDouble);
        System.out.println(s + secondPhrase);


        scan.close();
    }
}