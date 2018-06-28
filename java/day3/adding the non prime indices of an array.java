package day3.java;
import java.util.Scanner;

public class Nonprime 
{
	public static int nonprime(int[] a,int n)
	{
			int sum=0,flag=0;
			for(int i=0;i<n;i++)
			{
				flag=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						flag++;
					}
				}
				if(flag>2)
				{
					sum=sum+a[i];
				}
			}
			return sum;
	}
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int res=a[0]+nonprime(a,n);
			System.out.print(res);
			sc.close();
	}
}

