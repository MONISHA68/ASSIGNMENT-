#include <stdio.h>
int main()
{
    int a[10],i,n,k,max=0;
    scanf("%d %d",&n,&k);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<k;i++)
    {
       if(a[i]>max)
       {
           max=a[i];
       }
    }
    printf("%d",max);
	return 0;
}
