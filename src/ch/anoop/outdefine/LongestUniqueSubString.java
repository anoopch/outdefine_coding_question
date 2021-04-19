package ch.anoop.outdefine;

public class LongestUniqueSubString {

    public static int findLengethOfLongestSubstring(String expression) {

        int result = 1;
        int right = 0;
        int left = 0;
        char tempChar;

        int length = expression.length();
        int[] chars = new int[length * 100];

        while (right < length) {
            tempChar = expression.charAt(right);
            chars[tempChar]++;

            while (chars[tempChar] > 1) {
                chars[expression.charAt(left)]--;
                left++;
            }

            result = Math.max(right - left + 1, result);

            right++;
        }
        return result;
    }

    // Do not change the below code.

    public static void main(String[] args) {
        for (String expression : args) {
            System.out.println(findLengethOfLongestSubstring(expression));
        }
    }
}