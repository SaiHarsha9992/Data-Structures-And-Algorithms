import java.util.*;
class Powerornot
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		boolean k = n & (n-1);
		if(k==true){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}