#include<stdio.h>
int main()
{
int input[10],output[10],i,j,n=5,res=1;
for(i=0;i<n;i++)
{
	scanf("%d",&input[i]);
}
for(i=0;i<n;i++)
{
	res=1;
	for(j=0;j<n;j++)
	{
	if(i!=j)
	{
		res=res*input[j];
	}
	}
	output[i]=res;
}
for(i=0;i<n;i++)
{
	printf("%d\n",output[i]);
}
return 0;
}
