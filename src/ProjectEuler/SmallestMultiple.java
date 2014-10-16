package ProjectEuler;

import java.util.*;
public class SmallestMultiple {

	static int GCD(int a, int b)
	{
		if(b < a)	//B should always be greater than a 
		{
			b=b^a;
			a=b^a;
			b=b^a;
		}
		
		while(a!=0)
		{
			int temp=b%a;
			b=a;
			a=temp;
		}
		return b;
	}
	
	static void computeSmallestMultiple(int n)
	{
		int lcm=1;
		for(int i=2;i <=n;i++)
		{
			lcm=(lcm*i)/GCD(lcm,i);
		}
		System.out.println(lcm);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			computeSmallestMultiple(n);
		}
	}

}
