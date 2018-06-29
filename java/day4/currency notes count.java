package day4.java;

import java.util.Scanner;

public class Currencycount 
{
	static int currency(int n)
	{
		int count=0;
		while(n!=0)
		{
			if(n>=1000) 
			{
				n=n-1000;
				count++;
				continue;
			}
			if(n>=500) 
			{
				n=n-500;
				count++;
			}
			if(n>=100) 
			{
				n=n-100;
				count++;
			}
			if(n>=50) 
			{
				n=n-50;
				count++;
			}
			if(n>=10) 
			{
				n=n-10;
				count++;
			}
			if(n>=1) 
			{
				n=n-1;
				count++;
			}
				
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=currency(n);	
		System.out.print(res);
		sc.close();
	}
}
