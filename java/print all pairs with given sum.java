/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int num=sc.nextInt();
	    int sum=0;
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            sum=a[i]+a[j];
	            if(sum==num)
	            {
	                System.out.print("("+a[i]+","+a[j]+")");
	                sum=0;
	            }
	        }
	    }
	}
}
