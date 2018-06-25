package javastrings.java;

import java.util.Scanner;

public class Minnumberofswaps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    char[] ch1=s1.toCharArray();
	    char[] ch2=s2.toCharArray();
	    int n1=ch1.length;
	    int n2=ch2.length;
	    int count=0,res=1;
	    if(n1==n2)
	    {
	    	for(int i=0,j=0;i<n1 && j<n2;i++,j++)
	    	{
	    		if(ch1[i]==ch2[j])
	    		{
	    			continue;
	    		}
	    		else 
	    		{
	    			count++;
	    		}
	    	}
	    	res=count/2;
	    	System.out.print(res);
	    }
	    else
	    {
	    	System.out.print("-1..not possible");
	    }
	    sc.close();
	    }
}
