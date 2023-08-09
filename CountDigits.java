import java.util.*;
import java.io.*;
import java.lang.*;
class CountDigits
{
	public static int Count(int x){
		return (int)Math.log10(x)+1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int s =Count(n);
		System.out.println(s);
	}
}