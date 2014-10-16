package ProjectEuler;

import java.util.*;
class Node
{
	int x;
	int y;
	int product;
	Node(int x, int y, int product)
	{
		this.x=x;
		this.y=y;
		this.product=product;
	}
}
public class LargestPalindromeProduct {

	static ArrayList<Node> al=new ArrayList<Node>();
	static boolean checkPalindrome(String inp)
	{
		int left=0;
		int right=inp.length()-1;
		while(left < right)
		{
			if(inp.charAt(left)!=inp.charAt(right)) return false;
			++left;--right;
		}
		return true;
	}
	
	static void PalindromeProduct()
	{
		for(int i=100;i <=999;i++)
		{
			for(int j=i;j <=999;j++)
			{
				Integer p=i*j;
				if(checkPalindrome(p.toString())) al.add(new Node(i,j,p));
			}
		}
		//Sorting the list
		Collections.sort(al,new Comparator<Node>(){
			public int compare(Node n1, Node n2)
			{
				return n1.product-n2.product;
			}
		});
	}
	
	static int getMaximumPalindrome(int n)
	{
		int left=0;
		int right=al.size()-1;
		while(left <=right)
		{
			int mid=(left+right)/2;
			Node temp=al.get(mid);
			if(temp.product == n) return n;
			
			if(temp.product < n)
			{
				if(mid+1 == n) return temp.product;
				else
				{
					Node nextTemp=al.get(mid+1);
					if(nextTemp.product > n) return temp.product;
					else{
						left=mid+1;
					}
				}
			}else{
				right=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		PalindromeProduct();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			System.out.println(getMaximumPalindrome(n));
			
		}
	}

}
