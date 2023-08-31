import java.util.*;
class SeiveofErathoesus2
{
	public static boolean isPrime(int n){
		if(n<=1)
		{
			return false;
		}
		if(n==3||n==2){
			return true;
		}
		if(n%2==0||n%3==0){
			return false;
		}
		for(int i = 5 ; i <= Math.sqrt(n); i+=6){
			if(n%i==0||n%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		ArrayList <Integer> a = new ArrayList<Integer>(n);
		a.fill(a,1);
		for(int i = 2 ; i <=Math.sqrt(n); i++){
			if(isPrime(i))
			{
				for(int j = 2*i ; j <=n ; j+=i ){
					a.get(j)=0;
				}
			}
		}
		for(int i = 2 ; i <= n ; i++){
			if(a.get(i)==1){
				System.out.print(a.get(i)+" ");
			}
		}
	}
}