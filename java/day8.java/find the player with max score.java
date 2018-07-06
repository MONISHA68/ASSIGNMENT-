package day7.java;

import java.util.Scanner;

public class Playermaxsum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		int p=sc.nextInt();
		char[] ch=String.valueOf(p).toCharArray();
		int k=0,x=0;
		char max='0';
		char[] a=new char[n];
		for(int i=0;i<n;i++)
		{
			max=ch[i];
			for(int j=i+n;j<ch.length;j+=n)
			{
				if(max<=ch[j])
				{
					max=ch[j];
				}
			}
			a[k++]=max;
		}
		max=a[0];
		for(int i=1;i<k;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				x=i;
			}
		}
		System.out.println(str[x]+" : "+Character.getNumericValue(max));
		sc.close();
	}
}
