/* Given a string, S, find and return the highest occurring character present in the given string.
If there are 2 characters in the input string with same frequency, return the character which comes first.


Note : Assume all the characters in the given string are lowercase.


Input format :
String S
Output format :
Highest occurring character
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x */


// highest occurring character in the String.
public class HighestOccuringCharacter {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
		int n = inputString.length();
        int max = 0;
        int currCount = 0;
        char maxChar = inputString.charAt(0);
        for(int i=0; i<n; i++){
            currCount = 0;
            for(int j=0; j<n; j++){
                if(inputString.charAt(i) == inputString.charAt(j))
                    currCount++; 
            }
            if(currCount > max){
                max = currCount;
                maxChar = inputString.charAt(i);
            }
        }
        return maxChar;
	}
}
