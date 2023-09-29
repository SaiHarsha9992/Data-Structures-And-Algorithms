import java.util.*;
import java.lang.*;
import java.io.*;
public class SecondLargest
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int res = -1 , lar = 0;
		for (int i = 1; i < n; i++){
			if (a[i]>a[lar]){
				res = i;
				lar = i;
			}
			else if (a[i]!=a[lar]){
				if (res == -1 || a[i]  > a[res]){
					res = i;
				}
			}
		}
		System.out.println(res);
	}
}