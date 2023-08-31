import java.util.*;
class Factorialrecu
{
	public static int fun(int n , int k){
		if(n==0||n==1){
			return k;
		}
		return fun(n-1,k*n);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		int x = fun(n,k);
		System.out.println(x);
		sc.close();
	}
}