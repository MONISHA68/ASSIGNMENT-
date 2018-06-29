package day3.java;
import java.util.Scanner;

public class Stringtointeger 
	{
		public static int add(char[] ch)
		{
			int add=0;
			for(int i=0;i<ch.length;i++)
			{
				add=(add*10)+((int)ch[i]-48);
			}
			return add;
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			char[] ch1=s1.toCharArray();
			String s2=sc.nextLine();
			char[] ch2=s2.toCharArray();
			int res=add(ch1)+add(ch2);
			System.out.print(res);
			sc.close();
		}
	}
