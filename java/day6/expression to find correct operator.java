package day6.java;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		String x="";
		int num=0,deno=0;
		//char sign=' ';
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				x=x+ch[i];
			}
			else if(!(Character.isDigit(ch[i])) && ch[i]!='=')
			{
				num=Integer.parseInt(x);
				//sign=ch[i];
				x="";
				continue;
			}
			else if(ch[i]=='=')
			{
				deno=Integer.parseInt(x);
				x="";
			}
		}
		int res=Integer.parseInt(x);
		if(num+deno==res)
		{
			System.out.print("+");
		}
		else if(num-deno==res)
		{
			System.out.print("-");
		}
		else if(num/deno==res)
		{
			System.out.print("/");
		}
		else if(num*deno==res)
		{
			System.out.print("*");
		}
		sc.close();
	}
}
