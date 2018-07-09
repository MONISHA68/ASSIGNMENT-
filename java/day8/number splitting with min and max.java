package day8.java;

import java.util.Scanner;

public class Numbersplitminmax {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		int k=0;
		int[] a=new int[s.length*4];
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<(s[i].length()-1);j++)
			{
				String s1=s[i].substring(j,j+2);
				a[k++]=Integer.parseInt(s1);
			}
		}
		/*int num=sc.nextInt();
		char[] ch=String.valueOf(num).toCharArray();
		int n=ch.length;
		int k=0;
		String x="";
		int[] a=new int[ch.length];
		for(int i=0;i<n-1;i++)
		{
			x=x+(int)(ch[i]-48)+(int)(ch[i+1]-48);
			a[k++]=Integer.parseInt(x);
			x="";
		} */
		int min=999,max=-999;
		for(int i=0;i<k;i++)
		{
			System.out.println(a[i]+" ");
			if(min>a[i])
			{
				min=a[i];
			}
			else if(max<a[i])
			{
				max=a[i];
			} 
		}
		System.out.print("min:"+min+"  max:"+max);
		sc.close();
		}
}
