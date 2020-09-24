/*You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Most frequent element
Constraints :
0 <= N <= 10^8
Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :
2
Sample Input 2 :
3
1 4 5
Sample Output 2 :
1*/

import java.util.*;
public class Solution {

	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int maxval = arr[0];
        for(int i : arr){
            if(map.containsKey(i)){
                int freq = 1 + map.get(i);
                map.put(i, freq);
                if(freq > max){
                    max = freq;
                    maxval = i;
                }
                   
            }
            else{
                map.put(i, 1);
            }
        }
        return maxval;
	}
}