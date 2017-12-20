#include<stdio.h>
#include<string.h>
#define V 5;
#define X 10;
#define I 1;
#define D 500;
#define C 100;
int main() {
	char roman[30];
	char ch[100];
	int n,temp=0,i;
	scanf("%s",roman);
	n=strlen(roman);
    for(i=0;i<n;i++)
    {
        if(roman[i]<roman[i+1])
        {
            temp=temp+(roman[i+1]-roman[i]);
            
        }
        else if(roman[i]>=roman[i+1])
        {
             temp=temp+(roman[i]+roman[i+1]);
        }
      
    }
    printf("%d",temp);
	return 0;
}
