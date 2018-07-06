package day8.java;

import java.util.Scanner;
import java.util.Arrays;
public class Playersequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		int[] a=new int[n];
		//int[] b=new int[n];
		//Arrays.fill(b,0);
		int t=0;
		String temp="";
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			//b[i]=i;
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					temp=str[i];
					a[i]=a[j];
					str[i]=str[j];
					a[j]=t;
					str[j]=temp;
				}
			}
		}
		int count=1;
		for(int i=0,j=i+1;i<n && j<n;i++,j++)
		{
			if(a[i]+1==a[j])
			{
				count++;
			}
			else
			{
				break;
			}
			if(count==3)
			{
				break;
			}
		} 
		if(count==3)
		{
			for(int i=0;i<=2;i++)
			{
				System.out.println(str[i]+" : "+a[i]);
			}  
		}
		else
		{
			System.out.print("there is no sequence");
		}
		sc.close();
	}
}
