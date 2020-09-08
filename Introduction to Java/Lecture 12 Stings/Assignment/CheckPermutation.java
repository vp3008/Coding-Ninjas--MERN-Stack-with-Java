/* Given two strings, S and T, check if they are permutations of each other. Return true or false.
Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
Note : Input strings contain only lowercase english alphabets.


Input format :
Line 1 : String 1
Line 2 : String 2
Output format :
'true' or 'false'
Constraints :
0 <= |S| <= 10^7
0 <= |T| <= 10^7
where |S| represents the length of string, S.
Sample Input 1 :
abcde
baedc
Sample Output 1 :
true
Sample Input 2 :
abc
cbd
Sample Output 2 :
false */


public class CheckPermutation {

	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
		int l1 = input1.length();
        int l2 = input2.length();
        if(l1 != l2)
            return false;
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i=0; i<l1; i++)
        {
            sum1 += input1.charAt(i);
            sum2 += input2.charAt(i);
        }
        return sum1 == sum2;
	}
}
