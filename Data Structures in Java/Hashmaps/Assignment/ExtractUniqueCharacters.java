/* Given a string, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same.
Input format :
String S
Output format :
Output String
Constraints :
0 <= Length of S <= 10^8
Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde */

import java.util.*;

public class ExtractUniqueCharacters {

    public static String uniqueChar(String str) {
        // Write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                s = s + ch;
                map.put(ch, 1);
            }
        }
        return s;
    }
}
