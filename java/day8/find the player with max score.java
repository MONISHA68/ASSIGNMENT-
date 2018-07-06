package player.java;
import java.util.Scanner;
public class Playersequence {


public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		int p=sc.nextInt();
		char[] ch=String.valueOf(p).toCharArray();
		int k=0,x=0,y=0,sum=0,max=0,flag=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			sum=(int)ch[i]-48;
			for(int j=i+n;j<ch.length;j+=n)
			{
				sum=sum+(int)ch[j]-48;
			}
			//System.out.println(sum);
			a[k++]=sum;
			sum=0;
		}
		max=a[0];
		for(int i=1;i<k;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				x=i;
			}
			else if(max==a[i])
			{
				flag=1;
				y=i;
			}
		}
		if(flag==0)
		{
			System.out.println(str[x]+" : "+max);
		}
		else
		{
			System.out.println(str[x]+" : "+max+"\n"+str[y]+" : "+max);
		}
		sc.close();
	}
}
