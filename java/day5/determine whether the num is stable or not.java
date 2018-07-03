package day5.java;

import java.util.Scanner;

public class Digitsstability 
{
	public static boolean stability(int n)
	{
		char[] ch=String.valueOf(n).toCharArray();
		int count=0,max=-1;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			if(ch[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='+';
					count++;
				}
			}
			if(count>max && max==-1)
			{
				max=count;
				ch[i]='+';
			}
			else if(count==max)
			{
				ch[i]='+';
			}
			else if(count!=max && max!=-1)
			{
				break;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='+')
			{
				return false;
			}
			else
			{
				
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			boolean res=stability(a[i]);
			if(res)
			{
				System.out.print("stable"+" ");
			}
			else
			{
				System.out.print("unstable"+" ");
			}
		}
		sc.close();
	}
}
