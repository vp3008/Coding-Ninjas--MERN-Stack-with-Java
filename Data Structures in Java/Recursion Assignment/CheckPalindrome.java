/* Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false */



public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
		return input.equals(palindrome(input));
	}
    
    public static String palindrome(String s){
        if(s.length() == 0)
            return s;
        String smallOutput = palindrome(s.substring(1));
        return smallOutput + s.charAt(0);
    }
}
