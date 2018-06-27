package wipro.java;

import java.util.Scanner;

public class Password {

	public static int password(char[] ch,int n)
	{
		//char[] sp= {'!','@','#','.','$','%','^','&','*','(',')','-','+'};
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<n;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				if(Character.isLowerCase(ch[i]))
				{
					count1++;
				}
				else if(Character.isUpperCase(ch[i]))
				{
					count2++;
				}
			}
			else if(Character.isDigit(ch[i]))
			{
				count3++;
			}
			else
			{
				count4++;	
			}
		}
		if(n>=8 && (count1>=1 && count2>=1 && count3>=1 && count4>=1))
		{
			return 1;
		}
		else if(n>=6 && (count1>=1 && count2>=1 && count4>=1))
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int res=password(ch,n);
		if(res==1)
		{
			System.out.print("password is strong");
		}
		else if(res==2)
		{
			System.out.print("password is moderate");
		}
		else
		{
			System.out.print("password is weak");
		}
		sc.close();
	}
}
