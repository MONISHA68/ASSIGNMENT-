package day4.java;

import java.util.Scanner;

public class Pingenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=3;
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int rem1=0,rem2=0,rem3=0,min=0;
		String x="";
		int temp1=n1;
		int temp2=n2;
		int temp3=n3;
		while(n1!=0 && n2!=0 && n3!=0)
		{
			rem1=n1%10;
			rem2=n2%10;
			rem3=n3%10;
			if(rem1<=rem2 && rem1<=rem3)
			{
				min=rem1;
			}
			else if(rem2<=rem1 && rem2<=rem3)
			{
				min=rem2;
			}
			else
			{
				min=rem3;
			}
			//System.out.println(min);
			x=x+min;
			min=0;
			n1=n1/10;
			n2=n2/10;
			n3=n3/10;
		}
		String y="";
		y=y+temp1+temp2+temp3;
		char max='0';
		char[] ch=y.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i]>=max)
			{
				max=ch[i];
			}
		}
		x=x+max;
		String str="";
		for(int i=x.length()-1;i>=0;i--)
		{
			str=str+x.charAt(i);
		}
		System.out.print(str);
		sc.close();
	}
}
