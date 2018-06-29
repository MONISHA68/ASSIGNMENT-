package day3.java;

import java.util.Scanner;
public class Mostfrequentdigit 
{
	public static int frequentdigit(String s)
	{
		int count=0,max=-1;
		char x=' ';
		char[] ch=s.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++)
		{
			count=0;
			if(ch[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count+=2;
					ch[j]='+';
				}
			}
			if(count>max)
			{
				max=count;
				x=ch[i];
			}
			else if(count==max)
			{
				if(((int)ch[i]) > ((int)x))
				{
					x=ch[i];
				}
				else
				{
					
				}
			}
		}
		int num=Integer.parseInt(String.valueOf(x)); 
		return num;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1[]=new int[n];
		String s="";
		for(int i=0;i<n;i++)
		{
			n1[i]=sc.nextInt();
			String str=String.valueOf(n1[i]);
			s=s+str;
		}
		int res=frequentdigit(s);
		System.out.print(res);
		sc.close();
	}
}
