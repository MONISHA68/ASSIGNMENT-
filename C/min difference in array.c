#include <stdio.h>
int main()
{
	int n,x,y,a[10],i,j,diff,min=1;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
	   for(j=i+1;j<n;j++)
	   {
	       if(a[i]>a[j])
	       {
	           diff=a[i]-a[j];
	       }
	       else
	       {
	           diff=a[j]-a[i];
	       }
	       if(diff<=min)
	       {
	           diff=min;
	           x=a[i];
	           y=a[j];
	       }
	   }
	}
	printf("min difference is between %d and %d",x,y);
	return 0;
}
