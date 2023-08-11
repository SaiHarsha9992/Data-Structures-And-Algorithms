//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		


		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    private boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        if(n==2||n==3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i+=6) {
            if(n%i==0||n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    public int exactly3Divisors(int N)
    {
        //Your code here
        int c = 0;
        for(int i = 2 ; i <=Math.sqrt(N) ; i++)
        {
            if(isPrime(i)){
                c++;
            }
        }
        return c;
    }
}
