import java.util.*;
import java.lang.*;
import java.io.*;
class RopeCuttingProblem
{
	public static int fun(int n){
		if (n == 0){
			return 0;
		}
		if (n < 0){
			return -1;
		}
		int result = max(fun(n-a,a,b,c),fun(n-b,a,b,c),fun(n-c,a,b,c));
		if (result == -1){
			return -1;
		}
		return result+1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = fun(n,a,b,c);
		System.out.println(x);
	}
}