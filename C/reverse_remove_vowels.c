#include<stdio.h>
#include<string.h>
int main()
{
    char a[100],i,n;
    scanf("%s",a);
    n=strlen(a);
    for(i=n-1;i>=0;i--)
    {
        printf("%c",a[i]);
    }
    printf("\n");
    for(i=n-1;i>=0;i--)
    {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
        {
            continue;
        }
        else
        {
            printf("%c",a[i]);
        }
    }
    return 0;
}
