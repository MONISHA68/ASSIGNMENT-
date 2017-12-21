#include<stdio.h>
#include<string.h>
int main()
{
    char a[100];
    int count,ch,temp=0;
    int i,n,j,max=0;
    scanf("%s",a);
    n=strlen(a);
    for(i=0;i<n;i++)
    {
        count=1;
        if(a[i]=='+')
        {
            continue;
        }
        for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                ch[i]=count++;
                a[j]='+';
            }
            else
            {
                continue;
            }
        }
        temp=ch;
        if(max<temp)
        {
            max=temp;
        }
        
    }
    printf("%d",max);
   
        
    
        return 0;
    }
    
