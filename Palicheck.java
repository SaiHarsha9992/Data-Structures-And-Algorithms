import java.util.*;
class Palicheck
{
	public static boolean fun(String s, int start, int end){
		if(start>=end){
			return true;
		}
		return (s.charAt(start)==s.charAt(end)&&fun(s,start+1,end-1));
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int start = 0;
		int n = s.length();
		int end = n-1;
		boolean flag = fun(s,start,end);
		if (flag)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}