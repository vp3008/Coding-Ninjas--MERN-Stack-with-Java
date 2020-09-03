/* Given a random integer array and a number x. Find and print the triplets of elements in the array which sum to x.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x
Output format :
Line 1 : Triplet 1 elements (separated by space)
Line 2 : Triplet 3 elements (separated by space)
Line 3 : and so on
Constraints :
1 <= N <= 1000
1 <= x <= 100
Sample Input:
7
1 2 3 4 5 6 7 
12
Sample Output ;
1 4 7
1 5 6
2 3 7
2 4 6
3 4 5 */



import java.util.Arrays;
public class TripletSum {	

	public static void FindTriplet(int[] arr, int sum){
        Arrays.sort(arr);
        int low,high;
       for (int k = 0; k < arr.length - 2; k++) { 
  
            low = k + 1; // index of the first element in the remaining elements 
            high = arr.length - 1; 
            while (low < high) {
            if (arr[k] + arr[low] + arr[high] == sum) 
            {
                if(arr[low] == arr[high])
                {
                    int count = high - low + 1;
                    int n = count - 1;
                    int totalCount = ((n)*(n+1))/2 ;
                    while(totalCount > 0){
                        System.out.println(arr[k] + " " + arr[low] + " " + arr[high]);
                        totalCount--;
                    }
                    low = high;
                }
                else
                {
                    int countLow = 0;
                    int countHigh = 0;
                    int i = low;
                    int temp = arr[low];
                    
                    while(arr[i] == temp && i < high){
                        i++;
                        countLow++;
                    }
                    
                    int j = high;
                    temp = arr[high];
                    
                    while(arr[j] == temp && j > low){
                        j--;
                        countHigh++;
                    }
                    low = i;
                    high = j;
                    int total = countHigh * countLow;
                    while(total > 0){
                        System.out.println(arr[k] + " " + arr[low-1] + " " + arr[high+1]);
                        total--;
                    }
            	}
            }
            else if (arr[k] + arr[low] + arr[high] > sum) 
                high--;
            else 
            	low++;
        }
        } 
	}
}