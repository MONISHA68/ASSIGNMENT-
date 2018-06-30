package day4.java;

import java.util.Scanner;

public class Passwordgenerator 
{
	//static int sum=0;
	static int password(String s)
	{
		String[] str=s.split(" ");
		int len=str.length;
		char c=str[len-1].toString().charAt(len-1);
		int ascii=(int)c;
		int res=0;
	    //System.out.println(ascii);
		if(ascii<=9)
		{
			res=ascii;
		}
		else
		{
			res=sumcheck(ascii);
		}
	return res;
	}
	public static int sumcheck(int ascii)
	{
		int rem=0,sum=0;
		while(ascii!=0)
		{
			rem=ascii%10;
			sum=sum+rem;
			ascii/=10;
		}
		if(sum<=9)
		{
			
		}
		else
		{
			return sumcheck(sum);
		}
		return sum;
	}
	public static int phone(int n)
	{
		int res=0;
		if(n<=9)
		{
			res=n;
		}
		else
		{
			res=sumcheck(n);
		}
		return res;
	}
	public static int street(String floor)
	{
		int res=0,n=0;
		char[] ch=floor.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				n=n+(Integer.parseInt(String.valueOf(ch[i])));
			}
		}
		//System.out.println(n);
		if(n<=9)
		{
			res=n;
		}
		else
		{
			res=sumcheck(n);
		}
		return res;
	}
	public static char city(String city)
	{
		int res=0;
		char a=' ';
		char[] ch= {')','!','@','#','$','%','^','&','*','('};
		char c=city.charAt(0);
		int n=(int)c;
		res=sumcheck(n);
		a=ch[res];
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2=sc.nextLine();
		int n=Integer.parseInt(s2);
		String floor=sc.nextLine();
		String city=sc.nextLine();
		String password="";
		password=password+password(s)+phone(n)+street(floor)+city(city);
		System.out.print(password);
		sc.close();
	}
}
