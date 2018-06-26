/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static int palindrome(char[] ch,int n)
    {
        String rev="";
        String x=String.valueOf(ch);
        for(int i=n-1;i>=0;i--)
        {
          rev=rev+x.charAt(i);
        }
        if(rev.equals(x))
        {
            return 1;
        }
        else
        {
            x="";
            return 0;
        }
    }
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] ch=s.toCharArray();
    int n=ch.length;
    int flag=0;
   // String x=""
   char t=' ';
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
           int res=palindrome(ch,n);
           if(res==1)
           {
               System.out.print("palindrome");
               flag=1;
               break;
           }
           else
           {
               t=ch[i];
               ch[i]=ch[j];
               ch[j]=t;
           }
        }
        if(flag==1)
            break;
    }
    if(flag==0)
    {
        System.out.print("not palindrome");
    }
}
}
