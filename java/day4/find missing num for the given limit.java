/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	    int sum=0,sum1=0;
	    int[] a=new int[n];
	    
	    for(int i=1;i<=n;i++)
	    {
	        sum=sum+i;
	    }
	    for(int i=1;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=1;i<n;i++)
	    {
	        sum1=sum1+a[i];
	    }
	    int res=sum-sum1;
	    
		System.out.println(res);
	}
}
