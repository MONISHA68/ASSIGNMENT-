package day4.java;

import java.util.Scanner;

public class Palindrome 
{
	static int palindrome(int[] count,int n)
	{
		int odd=0;
		for(int i=0;i<n;i++)
		{
			if((count[i]&1)==1)
			{
				odd++;
			}
		}
		if(odd>1)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] ch=Integer.toString(n).toCharArray();
		int[] count=new int[256];
		int res=0;
		for(int i=0;i<ch.length;i++)
		{
			count[(int)ch[i]-48]=0;
		}
		for(int i=0;i<ch.length;i++)
		{		
			count[(int)ch[i]-48]++;
		}
		res=palindrome(count,count.length);
		if(res==1)
		{
			System.out.print("not a palindrome");
		}
		else 
		{
			System.out.print("is a palindrome");	
		}
		sc.close();
	}
}

