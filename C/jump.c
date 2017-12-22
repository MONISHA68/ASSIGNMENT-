#include <stdio.h>
int main() 
{
	int a[10],n,i,b,ch,count;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	b=a[n-1];
	for(i=0;i<n;i=i+a[i])           //     s=a[i]   i=i+s  ch=a[i+s]  
	{
	   ch=a[i+a[i]];
	   if(ch==b)
	   {
	       count=1;
	   }
	   
	   else
	   {
	       continue;
	   }
	}
	if(count==1)
	{
	    printf("true");
	}
	else
	{
	    printf("false");
	}
	 return 0;
}
