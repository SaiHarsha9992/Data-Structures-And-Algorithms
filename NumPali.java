import java.util.*;
class NumPali
{
	public static boolean fun(String s, int start, int end){
		if(start>=end){
			return true;
		}
		return (s.charAt(start)==s.charAt(end)&&fun(s,start+1,end-1));
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString();
		int start = 0;
		int h = s.length();
		int end = h-1;
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