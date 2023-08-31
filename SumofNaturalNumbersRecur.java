import java.util.*;
class SumofNaturalNumbersRecur
{
	public static int fun(int n ){
		if(n==0){
			return 0;
		}
		return n+fun(n-1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int x = fun(n);
		System.out.println(x);
	}
}