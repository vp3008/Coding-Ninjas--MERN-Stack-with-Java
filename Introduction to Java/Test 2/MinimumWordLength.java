/* Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a */



public class MinimumWordLength {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        String[] arr = input.split(" ");
        int min = Integer.MAX_VALUE;
        String minWord = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() < min){
                min = arr[i].length();
                minWord = arr[i];
            }
        }
        return minWord;
	}
}
