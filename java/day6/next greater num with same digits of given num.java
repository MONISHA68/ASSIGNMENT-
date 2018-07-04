package day6.java;
import java.util.*;
public class Nextgreaternum
{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String s=String.valueOf(n);
	        char[] ch=s.toCharArray();
	        int l=ch.length,count=0;
	        String x="1";
	        for(int i=0;i<l;i++)
	        {
	        	x=x+0;
	        }
	        int limit=Integer.parseInt(x);
	        int flag=0;
	        for(int i=n+1;i<limit;i++)
	        {
	        	count=0;
	        	String str=String.valueOf(i);
	        	for(int j=0;j<str.length();j++)
	        	{
	        		if(str.contains(String.valueOf(ch[j])))
	        		{
	        			count++;
	        		}
	        	}
	        	if(count==s.length())
	        	{
	        		System.out.println(str);
	        		flag=1;
	        		break;
	        	}
	        }
	        if(flag==0)
	        {
	        	System.out.println("not possible");
	        }
	        sc.close();
	}
}
