//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    
		    Solution  obj=new Solution ();
		    int A,B;
		    
		    //taking A and B
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method termOfGP() of class GP
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double a=(double)A;
        double b=(double)B;
        
        double d = b/a;
        double n1=A*(Math.pow(d,N-1));
        return n1;
    }

}
