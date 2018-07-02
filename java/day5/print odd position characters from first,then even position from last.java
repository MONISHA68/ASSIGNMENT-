package day5.java;

import java.util.Scanner;

public class Stringprintbyoneskip 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		String[] str=s.split(" ");
		int n=str.length;
		String x="";
		for(int i=0;i<n;i++)
		{
			char[] ch=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(j%2==0)
				{
					x=x+ch[j];
				}
			}
			for(int k=ch.length-1;k>=0;k--)
			{
				if(k%2!=0)
				{
					x=x+ch[k];
				}
			}
			x=x+" ";
		}
		System.out.print(x);
		sc.close();
	}
}
