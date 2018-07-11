import java.util.*;
public class Westernsystem 
{
	public static String[] units= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public static String[] tens= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	//public static String[] hundreds={"hundred","thousand","lakh","crore"};
	
	public static String convert(int n)
	{
		if(n<0)
		{
			return "minus "+convert(-n);
		}
		if(n==0)
		{
			return units[n];
		}
		if(n<20)
		{
			return units[n];
		}
		if(n<100)
		{
			return tens[n/10]+" "+convert(n%10);
		}
		if(n<1000)
		{
			return units[n/100]+" hundred "+convert(n%100);
		}
		if(n<10000)
		{
			return units[n/1000]+" thousand "+convert(n%1000);
		}
		if(n<100000)
		{
			return units[n/10000]+" lakh "+convert(n%10000);
		}
		
		return units[n/100000]+" crore "+convert(n%100000);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res=convert(n);
		System.out.print(res);
		sc.close();
	}
}
