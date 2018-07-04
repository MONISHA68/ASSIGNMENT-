package day7.java;

import java.util.Scanner;
import java.lang.Math;
public class Sumoftheseries 
{
	public static int series(int n)
	{
		double num=Math.pow(n,n);
		int res=(int)num/n;
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+series(i);
		}
		System.out.print(sum);
		sc.close();
	}

}
