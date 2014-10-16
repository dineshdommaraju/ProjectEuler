package ProjectEuler;
import java.util.*;
public class ProjectEuler1 {

	public static long getResult(long n)
	{
		long sum=0;
		long n3=(n-1)/3;
		long n5=(n-1)/5;
		long n15=(n-1)/15;
		sum=sum + (3)*(n3*(1+n3)/2) + (5)*(n5*(1+n5)/2)- (15)*(n15*(1+n15)/2);
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-- > 0)
		{
			long n=sc.nextLong();
			System.out.println(getResult(n));
		}

	}

}
