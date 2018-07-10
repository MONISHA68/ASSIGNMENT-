import java.util.*;
public class Arraysortingminmax
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[k++]=a[i];
			}
		}
		b[k++]=a[n-1];
		for(int i=k-1,j=0;i>=(k/2) && j<(k/2);i--,j++)
		{
			System.out.print(b[i]+" "+b[j]+" ");
		}
		if(k%2!=0)
		{
			System.out.print(b[k/2]+" ");
		}
		sc.close();
	}
}
