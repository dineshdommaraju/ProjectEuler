package ProjectEuler;

import java.util.*;
public class LargestPrimeFactor_3 {

	static long getLargestPrimeFactor(long n)
	{
		long largestPrime=1;
		while(n%2==0) 
		{
			largestPrime=2;
			n/=2;
		}
		while(n%3==0)
		{
			largestPrime=3;
			n/=3;
		}
		
		for(int i=1;n > 1;++i)
		{
			while(n%(6*i-1)==0)
			{
				largestPrime=6*i-1;
				n/=(6*i-1);
			}
			
			if((6*i-1)*(6*i-1) > n) 
				if(n > 1) return n;
			
			
			while(n%(6*i+1)==0)
			{
				largestPrime=6*i+1;
				n/=(6*i+1);
			}
			
			if((6*i+1)*(6*i+1) > n) 
				if(n > 1) return n;
			
		}
		
		return largestPrime;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
			long n=sc.nextLong();
			System.out.println(getLargestPrimeFactor(n));
		}

	}

}
