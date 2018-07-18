package day1.java;
import java.util.*;
public class Encodingstrings 
{
	public static String[] split(String[] str,int len)
	{
		String s1="";
		String s2="";
		String s3="";
		for(int i=0;i<len;i++)
		{
			String sp="";			
			sp=str[i];
			int n=sp.length();
			if(n%3==0)
			{
				String t="";
				for(int j=0;j<n;)
				{
					int p=j+3;
					t=sp.substring(j,p)+" ";
					s1=s1+t;
					j=p;
				}
				System.out.print(s1);
			}
			if((n-1)%3==0)
			{
					s2=sp.substring(0,(n/2)-1)+" "+sp.substring((n/2)-1,(n/2)+1)+" "+sp.substring((n/2)+1,n)+" ";
					System.out.print(s2);
			}
			if((n-2)%3==0)
			{
					s3=sp.substring(0,2)+" "+sp.substring(2,n-2)+" "+sp.substring(n-2,n)+" ";
					System.out.print(s3.toString());
			}
		}
		String result=s2+s3+s1;
		String[] res=result(result);
		return res;
	}
	
	public static String[] result(String res)
	{
		String[] str=res.split(" ");
		String s1=str[0]+str[3]+str[6];
		String s2=str[1]+str[4]+str[7];
		String s3=str[2]+str[5]+str[8];
		String[] s=output(s1,s2,s3);
		return s;
	}
	
	public static String[] output(String s1,String s2,String str)
	{
		String s3=str.toUpperCase();
		return new String[] {s1,s2,s3};
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1="John";
		String s2="Johny";
		String s3="Janardhan";
		String s=s1+" "+s2+" "+s3;
		String[] str=s.split(" ");
		int n=str.length;
		String[] res=split(str,n);
		System.out.println();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		sc.close();
	}
}
