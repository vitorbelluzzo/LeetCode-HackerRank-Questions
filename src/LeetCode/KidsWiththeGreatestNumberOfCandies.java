package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int biggestNumberOnList = 0;
        List<Boolean> list = new ArrayList<>();
        for (int number: candies) {
            if (number > biggestNumberOnList) {
                biggestNumberOnList = number;
            }
        }
        for (int i = 0; i < candies.length;i++) {
            if (candies[i] + extraCandies >= biggestNumberOnList) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        KidsWiththeGreatestNumberOfCandies kidsWiththeGreatestNumberOfCandies = new KidsWiththeGreatestNumberOfCandies();

        System.out.println(kidsWiththeGreatestNumberOfCandies.kidsWithCandies(candies,extraCandies));
    }
}
