package day7.java;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		sc.close();
	}
}
