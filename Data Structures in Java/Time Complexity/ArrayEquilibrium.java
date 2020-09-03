/* Find and return the equilibrium index of an array. Equilibrium index of an array is an index i such that the sum of elements at indices less than i is equal to the sum of elements at indices greater than i.
Element at index i is not included in either part.
If more than one equilibrium index is present, you need to return the first one. And return -1 if no equilibrium index is present.
Input format :
Line 1 : Size of input array
Line 2 : Array elements (separated by space)
Constraints:
Time Limit: 1 second
Size of input array lies in the range: [1, 1000000]
Sample Input :
7
-7 1 5 2 -4 3 0
Sample Output :
3  */


public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
     	int suffixSum = 0;
        int prefixSum = 0;
        for(int i : arr)
            suffixSum += i;
        for(int i=0; i<arr.length; i++){
            suffixSum -= arr[i];
            if(suffixSum == prefixSum){
                //System.out.println(i);
                return i;
            }
            prefixSum += arr[i];
        }
        return -1;
	}
}