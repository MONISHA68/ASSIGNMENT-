package day7.java;

import java.util.Scanner;

public class Factorial
{
	public static int fact(int n)
	{
		int fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;;
		for(int i=1;i<=n;i++)
		{
			sum=sum+fact(i);
		}
		System.out.print(sum);
		sc.close();
	}

}
