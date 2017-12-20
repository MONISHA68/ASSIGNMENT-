#include<stdio.h>
#include<string.h>
int main()
{
    char a[100];
    int temp=0;
    int n,i;
    scanf("%s",a);
    n=strlen(a);
    for(i=0;i<n;i=i+2)
    {
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
    }
   if((n%2)!=0)
    {
         printf("%s%c",a,temp);
    }
    else
    {
         printf("%s",a);
    }
    
    return 0;    
}
