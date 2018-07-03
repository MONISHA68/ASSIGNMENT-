package day6.java;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=1;
	for(int i=1;i<=n;i++)
	{
		x=i;
		for(int j=n;j>=i;j--)
		{
			System.out.print(x+" ");
			x=x+j;
		}
		System.out.println();
	}
	sc.close();
	}
}
