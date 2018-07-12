package day8.java;
import java.util.*;
public class Missingletter
{
	public static String missing(char[] st,String s)
	{
		char[] ch=s.toCharArray();
		if(st.length==ch.length)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(st[i]!=ch[i] && st[i]=='_')
				{
					st[i]=ch[i];
					break;
				}
			}
		}
		return String.valueOf(st);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split("\\s");
		int n=str.length,pos=0;
		String st="";
		for(int i=0;i<n;i++)
		{
			char[] ch=str[i].toCharArray();
			for(int j=0;j<str[i].length();j++)
			{
				if(ch[j]=='_')
				{
					st=str[i];
					pos=i;
					break;
				}
			}
		}
		char[] ch=st.toCharArray();
		int flag=0;
		String[] b=new String[3];
		for(int i=0;i<3;i++)
		{
			b[i]=sc.next();
		}
		for(int i=0;i<3;i++)
		{
			String a=b[i];
			String res=missing(ch,a);
			if(res.equals(a))
			{
				flag=1;
				s="";
				for(int j=0;j<n;j++)
				{
					if(j!=pos)
					{
						s=s+str[j]+" ";
					}
					else
					{
						s=s+res+" ";
					}
				}
				System.out.print(s);
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("no matching filler");
		}
		sc.close();
	}
}
