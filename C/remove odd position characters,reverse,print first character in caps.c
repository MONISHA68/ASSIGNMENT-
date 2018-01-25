#include <stdio.h>
#include<string.h>
int main() 
{
	char a[10],b[10];
	int n,i,count=0,k=0;
	scanf("%s",a);
	n=strlen(a);
	for(i=0;i<n;i++)
	{
	    if(i%2!=0)
	    {
	        b[k]=a[i];
	        k++;
	        count++;
	    }
	}

	for(i=count-1;i>=0;i--)
	{
	    if(i==(count-1))
	    {
	        if(b[i]>=97 && b[i]<=122)
	        {
	        printf("%c",b[i]-32);
	        }
	        else
	        {
	            printf("%c",b[i]);
	        }
	    }
	    else
         {
	        printf("%c",b[i]);
	    }
	    
	}
    

	return 0;
}
