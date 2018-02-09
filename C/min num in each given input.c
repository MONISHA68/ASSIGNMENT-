#include <stdio.h>
int main() 
{
    int n,a[1000],i,j,count=0,min;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d\n",&a[i]);
        count++;
        min=a[0];
        for(j=0;j<count;j++)
        {
           if(min>=a[j])
           {
               min=a[j];
           }
        }
        printf("%d ",min);
    }
	return 0;
}
