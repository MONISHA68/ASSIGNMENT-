package day6.java;
import java.util.*;
import java.math.*;
public class Nextgreaternum
{
   static int find(int num) 
   {
	        int dig[]=new int[10];
	        int i=0,n=num;
	        while(n>0)
	        {
	            dig[i++]=n%10;
	            n/=10;
	        }
	        int len=i;
	        for(i=0;i<len-1;i++)
	        {
	            if(dig[i] > dig[i+1])
	            {
	                int t=dig[i];
	                dig[i]=dig[i+1];
	                dig[i+1]=t;
	                
	                return answer(dig,len);
	            }
	        }
	        return 0;
	    }
	    static int answer(int dig[], int l)
	    {
	        int ans=0;
	        for(int i=0;i<l;i++)
	        {
	            ans+=dig[i]*Math.pow(10, i);
	            System.out.print(ans+" ");
	        }
	        return ans;
	    }
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int val=find(n);
	        if(val > 0) 
	        {
	            System.out.print(val);
	        }
	        else 
	            System.out.print(" Not possible");
	        sc.close();
	}
}
