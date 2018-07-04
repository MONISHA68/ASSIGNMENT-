package day7.java;

import java.util.Scanner;

public class Patterncomplex {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=9;i>=1;i--)
		{
			if(i==6)
			{
				continue;
			}
			for(int j=1;j<=9;j++)
			{
				if(j<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=9;k>=1;k--)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
		
		////for space can use (n-i)*2
	}
}
