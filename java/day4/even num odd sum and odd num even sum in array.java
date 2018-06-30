package day4.java;

import java.util.Scanner;

public class Oddevensum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int sum=0,n=0;
		int[] a=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			sum=0;
			n=a[i];
			if(n%2!=0)
			{
				sum=sum+n;
				while(sum%2!=0)
				{
					i++;
					if(i==n1)
					{
						break;
					}
					else
					{
						sum=sum+a[i];
					}
				}
				if(sum%2==0)
				{
					System.out.print(sum+" ");
				}
			}
			else
			{
				sum=0;
				sum=sum+n;
				while(sum%2==0)
				{
					i++;
					if(i==n1)
					{
						break;
					}
					else
					{
						sum=sum+a[i];
					}
				}
				if(sum%2!=0)
				{
					System.out.print(sum+" ");
				}
			}
		}
		sc.close();
	}
}
