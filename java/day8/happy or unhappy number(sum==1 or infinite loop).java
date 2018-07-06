package day8.java;

import java.util.Scanner;

public class Happyunhappynumbers 
{
	public static boolean happy(int n)
	{
		int rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem==0)
			{
				sum=sum+rem;
			}
			else 
			{
				sum=sum+(rem*rem);
			}
			n/=10;
		}
		//System.out.print(sum);
		if(sum==1)
		{
			return true;
		}
		if(sum>9)
		{
			return happy(sum);
		}
		if(sum!=1 && sum<=9)
		{
			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag;
		flag=happy(n);
		if(flag)
		{
			System.out.print("happy number");
		}
		else
		{
			System.out.print("unhappy number");
		}
		sc.close();
	}
}
