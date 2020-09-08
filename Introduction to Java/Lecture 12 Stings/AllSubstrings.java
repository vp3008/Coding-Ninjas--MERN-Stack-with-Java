
public class AllSubstrings {

	public static void printSubstrings(String str){
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question.
		*/
        int n = str.length();
		for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.println(str.substring(i,j));
            }
        }
	}
}