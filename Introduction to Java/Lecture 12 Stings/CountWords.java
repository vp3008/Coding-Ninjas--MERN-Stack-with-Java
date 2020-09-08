/* Given a string S, count number of words in the string.
Note : Assume there is single space between two words and there are no extra spaces before and after words.


Input Format :
 String S
Output Format :
Count of words
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
this is a sample string
Sample Output 1:
5
Sample Input 2:
coding is awesome
Sample Output 2:
3 */

public class CountWords {

    public static int countWords(String str) {

        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        return count + 1;
        // String[] arr = str.split(" ");
        // return arr.length;
    }
}
