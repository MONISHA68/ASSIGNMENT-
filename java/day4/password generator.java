package day4.java;

import java.util.Scanner;

public class Passwordgenerator 
{
	static int password(String s,int n,String floor,String city)
	{
		String x="";
		int sum=0,rem=0;
		String[] str=s.split(" ");
		int len=str.length;
		char c=str[len-1].toString().charAt(len-1);
		int ascii=(int)c;
		if(ascii<=9)
		{
			x=x+ascii;
		}
		else
		{
			while(ascii!=0)
			{
				rem=ascii%10;
				sum=sum+rem;
				ascii/=10;
			}
			if(sum<=9)
			{
				return sum;
			}
			else 
			{
				return sum;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		String floor=sc.nextLine();
		String city=sc.nextLine();
		int password=password(s,n,floor,city);
		System.out.print(password);
		sc.close();
	}
}
