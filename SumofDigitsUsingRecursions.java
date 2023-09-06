import java.util.*;
class SumofDigitsUsingRecursions
{
	public static int fun(int n, int k){
		if(n<=9){
			return n;
		}
		return fun(n/10,k+(n%10));
	}
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = 0;
		int x = fun(n,k);
		System.out.println(x);
	}
}