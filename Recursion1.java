import java.util.*;
class Recursion1
{
	public static void fun(int n){
		if(n==0)
			return;
		fun(n-1);
		System.out.print(n+" ");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(n);
	}
}