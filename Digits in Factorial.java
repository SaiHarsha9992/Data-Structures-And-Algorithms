//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    public int digitsInFactorial(int N){
        // code here
        
        double p = 0;
        for(int i = 2 ; i <= N ; i++){
            p = p + Math.log10(i);
        }
        return (int)Math.floor((p+1));
    }
}
