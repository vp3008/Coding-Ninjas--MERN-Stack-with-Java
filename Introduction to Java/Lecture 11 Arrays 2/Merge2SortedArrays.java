
public class Merge2SortedArrays {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<n1 && j <n2) 
        { 
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        } 
      
        // Store remaining elements of first array 
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
      
        // Store remaining elements of second array 
        while (j < n2) 
            arr3[k++] = arr2[j++];
        
        return arr3;
    }
}