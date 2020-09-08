/* Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always */


public class ReverseStringWordwise {
	public static String reverseWordWise(String input) {
		// Write your code here
       	String result = "";
        input = input + " ";
        int n = input.length();
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<n; i++){

            if(input.charAt(i) == ' '){
                //sb.reverse();
            	result = sb.toString() + " " + result;
                sb = new StringBuffer("");
            }
            else{
                sb.append(input.charAt(i));
            }
        }
        return result;
	}
}
