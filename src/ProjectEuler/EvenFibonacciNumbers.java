package ProjectEuler;

import java.util.*;
public class EvenFibonacciNumbers {
	
	static long getSum(long inp, ArrayList<Long> fib)
	{
		long sum=0;
		for(long x : fib)
		{
			if(x <=inp)
			{
				if(x%2==0)
					sum+=x;
			}
			else
				break;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		long n=(long)(Math.pow(10,16)*4);
		long a=1;
		long b=2;
	
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> fib=new ArrayList<Long>();
		fib.add((long) 1);
		fib.add((long)2);
		
		while(b <=n)
		{
			long c=b+a;
			a=b;
			b=c;
			fib.add(b);
		}
		
		//
		int t=sc.nextInt();
		while(t-- > 0)
		{
			long inp=sc.nextLong();
			System.out.println(getSum(inp,fib));
		}
		
		
		
	}

}
