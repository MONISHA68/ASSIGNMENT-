#include<stdio.h>
int main()
{
	int n,p=2,x=1,i;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
	    x=p*x;
	    if(x==n)
	    {
	        printf("yes");
	        break;
	    }
	    else
	    {
	        continue;
	    }
	}
	if(x!=n)
	{
	    printf("no");
	}
	return 0;
}
