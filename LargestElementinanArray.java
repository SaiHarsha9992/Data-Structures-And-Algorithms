import java.util.*;
import java.io.*;
import java.lang.*;
public class LargestElementinanArray
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int p = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			if (a[i]>a[p]){
				p = i;
			}
		}
		System.out.println(p);
	}
}