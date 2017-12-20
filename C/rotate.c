#include<stdio.h>
int main()
{
    int a[100],i,j,n,k,temp=0;
    scanf("%d",&n);
    scanf("%d",&k);
    for(i=0;i<n;i++)
    {
    scanf("%d",&a[i]);
    }
    for(j=0;j<k;j++)
    {
    temp=a[0];
    for(i=0;i<n;i++)
    {
        a[i]=a[i+1];
    }
    a[n-1]=temp;
    }
    for(i=0;i<n;i++)
    {
    printf("%d\n",a[i]);
    }
    return 0;
}
