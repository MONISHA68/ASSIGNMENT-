package day6.java;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a=new int[m+1][n+1];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j][i]==0)
				{
					continue;
				}
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
