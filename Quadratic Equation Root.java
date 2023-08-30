//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList <Integer> l = new ArrayList <Integer>();
        double d = Math.pow(b,2)-(4*a*c);
        if(d<0){
            l.add(-1);
        }
        else{
            double s1 = (-b+Math.sqrt(d))/(2*a);
            double s2 = (-b-Math.sqrt(d))/(2*a);
            
            l.add((int)Math.floor(Math.max(s1,s2)));
           l.add((int)Math.floor(Math.min(s1,s2)));
        }
        return l;
    }
}