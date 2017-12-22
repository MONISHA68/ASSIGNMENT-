#include<stdio.h>
#include<string.h>
int main()
{
    char a[100],ch;
    int count=0;
    int i,n,j,max=0;
    scanf("%s",a);
    n=strlen(a);
    for(i=0;i<n;i++)
    {
        count=1;
       for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                count++;
               
            }
            else
            {
                continue;
            }
      }
      if(max<count)
      {
      	max=count;
      	ch=a[i];
	  }
    }
    printf("%c-%d",ch,max);
    return 0;
}
