package day3.java;

import java.util.Scanner;

public class Weightofstr 
{
	public static int include(char[] ch,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+(int)ch[i]-96;
		}
		return sum;
	}
	public static int exclude(char[] ch,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(!(ch[i]=='a'||ch[i]=='e'|| ch[i]=='i'|ch[i]=='o'||ch[i]=='u'))
			{
				sum=sum+(int)ch[i]-96;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		char[] ch=s.toCharArray();
		int len=ch.length;
		int n1=sc.nextInt();
		if(n1==1)
		{
			int res=include(ch,len);
			System.out.print(res);
		}
		else if(n1==0)
		{
			int res=exclude(ch,len);
			System.out.print(res);
		}
		sc.close();
	}
}
