#include<stdio.h>
#include<string.h>
int main()
{
    char roman[10],a[10];
    int n,i,j,sum=0;
    scanf("%s",roman);
    n=strlen(roman);
    for(i=0;i<n;i++)
    {
        if(roman[i]=='I')
        {
            a[i]=1;
        }
        else if(roman[i]=='V')
        {
            a[i]=5;
        }
        else
        {
            a[i]=10;
        }
    }
    sum=a[n-1];
    for(i=(n-1);i>0;i--)
    {
        if(a[i]>a[i-1])
        {
            sum=sum-a[i-1];
        }
        else 
        {
            sum=sum+a[i-1];
        }
    }
    printf("%d",sum);
    return 0;
}
