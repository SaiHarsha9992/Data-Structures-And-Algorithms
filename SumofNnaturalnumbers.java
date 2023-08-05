import java.util.*;
class SumofNnaturalnumbers
{
	public static void main (String args []){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int s = (n*(n+1))/2;
		System.out.println(s);
	}
}