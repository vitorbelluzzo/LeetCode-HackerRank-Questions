package HackerRank.ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day6LetsReview {

        public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              int t = scan.nextInt();
              scan.nextLine();

            for (int i = 0; i < t; i++) {
                String s = scan.nextLine() ;
                int n = s.length();
                StringBuilder firstWord = new StringBuilder();
                StringBuilder secondWord = new StringBuilder();

                for (int j = 0; j < n ; j++) {
                    if (j% 2== 0) {
                        firstWord.append(s.charAt(j));
                    } else {
                        secondWord.append(s.charAt(j));
                    }
                }

                System.out.println(firstWord + " " + secondWord);
            }
            scan.close();
                /*Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }

}
