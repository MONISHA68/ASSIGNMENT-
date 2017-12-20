#include<stdio.h>
#include<string.h>
int main()
{
    char a[100];
    int n,count=1,i,j;
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
              count++;
              a[j]='+';
          }
      }
      printf("%c - %d\n",a[i],count);
    }
    return 0;
}
