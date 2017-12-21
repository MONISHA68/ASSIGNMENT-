#include <stdio.h>
#include<string.h>
int main() 
{
	char a[100];
	int n,i,count=0,count1=0;
	scanf("%s",a);
	n=strlen(a);
	for(i=0;i<n;i++)
	{
	    if(a[i]>='a'&& a[i]<='z'||a[i]>='A'&&a[i]<='Z')
	    {
	        count++;
	    }
	    else if(a[i]>='0'&&a[i]<='9')
	    {
	        count1++;
	    }
	    else
	    {
	        continue;
	    }
	    
	}
	printf("alpha:%d\n",count);
	printf("numerals:%d",count1);
	return 0;
}
