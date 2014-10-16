package ProjectEuler;

import java.util.Scanner;

public class SumSquareDifference {

	static long getSumSquareDifference(long n)
	{
		long sum1=(n*n*(n+1)*(n+1))/4;
		long sum2=(n*(n+1)*(2*n+1))/6;
		System.out.println(sum1+" "+sum2);
		
		if(sum1 > sum2) return sum1-sum2;
		return sum2-sum1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			System.out.println(getSumSquareDifference(n));
		}

	}

}
