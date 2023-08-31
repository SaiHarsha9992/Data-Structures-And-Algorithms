import java.util.*;
class Fibnocciirecu
{
	public static void fun(int n , int a ,int b,int c ){
		
		if(n==0){
			return ;
		}
		c = a+b;
		System.out.println(c);
		b = a;
		c = b;
		return fun(n-1,a,b,c);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0 , b = 1, c = 0;
		System.out.println("0"+" "+"1");
		fun(n,a,b,c);
	}
}