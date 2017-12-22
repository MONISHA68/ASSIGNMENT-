#include<stdio.h> 
#include<string.h> 
int main()
{
    char a[50];
    scanf("%s",a);
    int i,count[50],j;
    int n=strlen(a);
    for(i=0;i<n;i++) 
    { 
        count[i]=1;
        if(a[i]=='+')
        { 
            continue;
        } 
        for(j=i+1;j<n;j++)
        { 
            if(a[i]==a[j])
            { 
                count[i]=count[i]+1;
                a[j]='+';
            }
        } 
    }
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(count[i]>count[j]) 
            printf("%c\n",a[i]);
            break;
        }
    }
}
