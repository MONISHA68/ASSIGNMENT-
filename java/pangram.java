package javastrings.java;

import java.util.Scanner;

public class Pangram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char[] ch=s.toCharArray();
	    int n=ch.length;
	    char[] p= {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    int len=p.length;
	    int count=0;
	    for(int i=0;i<len;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(ch[j]==p[i])
	    		{
	    			count++;
	    			p[i]='+';
	    		}
	    	}
	    }
	    if(count==len)
	    {
	    	System.out.print("yes..");
	    }
	    else
	    {
	    	System.out.print("no..");
	    }
	    sc.close();
	}
}
