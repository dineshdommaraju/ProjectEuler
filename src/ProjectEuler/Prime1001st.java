package ProjectEuler;

import java.util.*;
public class Prime1001st {

	static ArrayList<Integer> primeList=new ArrayList<Integer>();
	static boolean checkPrime(int n)
	{
		if(n==2) return true;
		if(n%2==0) return false;
		
		for(int i=3; i*i <=n;i++) if(n%i==0) return false;
		return true;
	}
	
	static void computePrime(int n)
	{
		for(int i=2; primeList.size()<=n;i++)
		{
			if(checkPrime(i)) primeList.add(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		computePrime(10000);
		while(t-- > 0)
		{
			int n=sc.nextInt();
			System.out.println(primeList.get(n-1));
		}
	}
}
