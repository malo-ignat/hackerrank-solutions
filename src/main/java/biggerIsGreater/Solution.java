/*
Lexicographical order is often known as alphabetical order
when dealing with strings. A string is greater than another string
if it comes later in a lexicographically sorted list.
Given a word, create a new word by swapping some or all of its characters.
This new word must meet two criteria:
It must be greater than the original word
It must be the smallest word that meets the first condition
Example w = abcd;
The next largest word is abdc.
Complete the function biggerIsGreater below to create and return
the new string meeting the criteria. If it is not possible, return no answer.
The article about Lexicographical order:
https://www.quora.com/How-would-you-explain-an-algorithm-that-generates-permutations-using-lexicographic-ordering
*/

package biggerIsGreater;

public class Solution {

    private static int smallestGreater(String input, int left) {

        int nextLeft = left + 1;
        char[] temp = input.substring(nextLeft).toCharArray();
        int min = input.charAt(nextLeft);
        int minIndex = 0;

        for (int i = 0; i < input.length() - nextLeft; i++) {
            if (temp[i] > input.charAt(left) && temp[i] < min) {
                min = temp[i];
                minIndex = i;
            }
        }
        int right = left + minIndex + 1;
        return right;
    }

    private static String swap(String input, int left, int right) {

        StringBuilder temp = new StringBuilder(input);
        temp.setCharAt(left, input.charAt(right));
        temp.setCharAt(right, input.charAt(left));
        return temp.toString();
    }

    private static String reverse(String input, int left) {

        int nextLeft = left + 1;
        StringBuilder temp = new StringBuilder(input);
        int last = input.length() - 1;

        for (int i = 0; i <= (last - nextLeft); i++) {
            temp.setCharAt(nextLeft + i, input.charAt(last - i));
        }
        return temp.toString();
    }

    public static String biggerIsGreater(String w) {

        int left = w.length() - 2;

        while (left >= 0 && w.charAt(left) >= w.charAt(left + 1)) {
            left--;
        }

        if (left < 0) {
            return "no answer";
        } else {
            int right = smallestGreater(w, left);
            w = swap(w, left, right);
            w = reverse(w, left);
            return w;
        }
    }
}
