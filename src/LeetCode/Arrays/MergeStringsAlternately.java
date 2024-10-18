package LeetCode.Arrays;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int word1length = word1.length();
        int word2length = word2.length();
        int wordsLength = word1length + word2length;
        for(int i = 0; i< wordsLength; i++) {
            if(i < word1.length()) {
                mergedString.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                mergedString.append(word2.charAt(i));
            }
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {

        String word1 = "ab";
        String word2 = "pqrs";

        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

        System.out.println(mergeStringsAlternately.mergeAlternately(word1, word2));

    }

}
