package javastrings.java;
import java.util.*;
public class Palindromicbyswappingonce {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    char[] a=s.toCharArray();
	    int n=a.length;
	    char[] res=Arrays.copyOf(a,n/2+1);
	    int flag=0,k=0;
	    char t=' ';
	    char[] b=new char[n/2+1];
	    for(int i=n-1;i>=n/2;i--)
	    {
	    	b[k]=a[i];
	    	//System.out.print(b[k]);
	    	k++;
	    }

		Arrays.sort(res);
		Arrays.sort(b);
		res=null;
		b=null;
		k=0;
		if(Arrays.equals(res,b))
		{
			res=Arrays.copyOf(a,n/2+1);
			for(int i=n-1;i>=n/2;i--)
		    {
		    	b[k]=a[i];
		    	//System.out.print(b[k]);	
		    	k++;
			}
		    for(int i=0;i<n/2;i++)
		    {
		    	for(int j=i+1;j<=n/2;j++)
		    	{
		    		t=res[i];
		    		res[i]=res[j];
		    		res[j]=t;
		    		if(Arrays.equals(res,b))
		    		{
		    			System.out.print("true..palindrome by swapping once");
		    			flag=1;
		    			break;
		    		}
		    		else
		    		{
		    			res=null;
		    			res=Arrays.copyOf(a,n/2+1);
		    		}
		    	}
		    	if(flag==1)
		    		break;
		    }
		}
		else
		{
			System.out.print("false..not palindrome by swapping once");	
		}
	    if(flag==0)
	    {
	    	System.out.print("false..not palindrome by swapping once");
	    }  
		sc.close();	    
	}
}
