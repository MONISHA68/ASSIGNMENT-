import java.util.*;
public class Stringpassword {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		int n=ch.length,num=0,count=0;
		String x="",y="";
		for(int i=0;i<n-1;i+=count+1)
		{
			y=y+ch[i];
			count=0;
			if(ch[i+1]>='0' && ch[i+1]<='9')
			{
				for(int j=i+1;j<n;j++)
				{
					if(ch[j]>='0' && ch[j]<='9')
					{
						count++;
						x=x+ch[j];
					}
					else
					{
						break;
					}
				}
				num=Integer.parseInt(x);
				x="";
				for(int k=1;k<num;k++)
				{
					y=y+ch[i];
				}
			}
		}
		System.out.print(y);
		sc.close();
	}
}
