package day4.java;

import java.util.Scanner;

public class Currencycount 
{
	static int currency(int[] amt,int n)
	{
		int count=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			for(int i=0;i<amt.length;i++)
			{
				if(rem>=amt[i])
				{
					rem*amt[i];
				}
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] amt= {1000,500,100,50,1};
		int res=currency(amt,n);	
		System.out.print(res);
		sc.close();
	}
}
