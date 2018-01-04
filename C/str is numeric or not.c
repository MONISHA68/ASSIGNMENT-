#include <stdio.h>
#include<string.h>
int main()
{
	char a[100];
	int i,n,count=0;
	scanf("%s",a);
	n=strlen(a);
	for(i=0;i<n;i++)
	{
	    if((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z'))
	    {
	        count=0;
	        printf("false");
	        break;
	    }
	    if(a[i]>='0'&&a[i]<='9')
    	{
    	    count=1;
	        continue;
	    }
	}
	if(count==1)
	{
	    printf("true");
	}
	return 0;
}
