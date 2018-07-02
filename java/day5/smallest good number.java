package day5.java;
import java.util.*;
public class Goodbadnumber {
		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int num=sc.nextInt();
		        String x="";
		        for(int i=1;i<=num;i++)
		        {
		            if(i%2!=0) 
		            {
		                x=x+1;
		            }
		            else
		            {
		                if(i%2==0 && i%4!=0)
		                {
		                    x=x+2;
		                }
		                else if(i%2==0 && i%4==0)
		                {
		                    x=x+3;
		                }
		            }
		        }
		        System.out.print(x);
		        sc.close();
		    }
		}
