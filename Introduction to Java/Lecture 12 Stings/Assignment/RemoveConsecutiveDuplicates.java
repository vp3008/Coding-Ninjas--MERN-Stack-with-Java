/* Given a string, S, remove all the consecutive duplicates that are present in the given string. That means, if 'aaa' is present in the string then it should become 'a' in the output string.
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx */

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String input) {
        // Write your code here
        // ring input1 = "aaaaaaaaa";

        int l1 = input.length();

        String result = "" + input.charAt(0);
        int j = 0;
        for (int i = 1; i < l1; i++) {
            if (input.charAt(i) == result.charAt(result.length() - 1))
                continue;
            result = result + input.charAt(i);
        }
        return result;
    }
}
