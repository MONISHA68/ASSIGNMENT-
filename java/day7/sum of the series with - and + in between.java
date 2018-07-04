package day7.java;
import java.util.*;
public class Sumandsubofseries {

	public static double series(int n)
	{
		double num=Math.pow(n,n);
		int fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		double res=num/(double)fact;
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum-series(i);
			}
			else
			{
				sum=sum+series(i);
			}
		}
		System.out.print(sum);
		sc.close();
	}
}
