/* Given a string and a character x. Write a function to remove all occurrences of x character from the given string.
Leave the string as it is, if the given character is not present in the string.


Input Format :
Line 1 : String S
Line 2 : Character c
Output Format :
Modified string
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
welcome to coding ninjas
o
Sample Output 1:
welcme t cding ninjas
Sample Input 2:
Think of edge cases before submitting solutions
x
Sample Output 2:
Think of edge cases before submitting solutions */


public class RemoveCharacter {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
        int n = input.length();
        String result = "";
        for(int i=0; i<n; i++){
            if(input.charAt(i) == c)
                continue;
            result = result + input.charAt(i);
        }
		return result; 
	}

}
