package day3.java;

import java.util.Scanner;

public class Stringtointegercarry 
{
	public static String integercarry(char[] ch1,char[] ch2)
	{
		int n1=ch1.length;
		int n2=ch2.length;
		//System.out.println(n1+" "+n2);
		int x=0,rem=0,c=0;
		String s="";
		for(int i=n1-1,j=n2-1;i>=0 && j>=0;i--,j--)
		{
			x=c+Character.getNumericValue(ch1[i])+Character.getNumericValue(ch2[i]);
			rem=x%10;
			c=0;
			s=s+rem;
			c=x/10;
			x=0;
		}
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n1=s1.length();
		int n2=s2.length();
		int n=0;
		if(n1<n2)
		{
			n=n2-n1;
			for(int i=0;i<n;i++)
			{
				s1=0+s1;
			}
		}
		else
		{
			n=n1-n2;
			for(int i=0;i<n;i++)
			{
				s2=0+s2;
			}
		}
		//System.out.print(s1+" "+s2);
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		System.out.print(integercarry(ch1,ch2));
		sc.close();
	}
}
