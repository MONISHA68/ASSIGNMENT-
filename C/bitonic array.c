#include <stdio.h>
#include<string.h>
int main()
{
    int a[10];
    int n,i,max=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
        else
        {   
            printf("%d",max);
            break;
        }
    }
    return 0;
}
