#include <stdio.h>
int main() 
{
	int hr[10],mins[10];
	int res[10],i,diff=0,hour,min;
	for(i=0;i<2;i++)
	{
	    scanf("%d:%d",&hr[i],&mins[i]);
	}
	for(i=0;i<2;i++)
	{
	    res[i]=(hr[i]*60)+mins[i];
	}
	for(i=0;i<2;i++)
	{
	if(res[i+1]>res[i])
	{
	    diff=res[i+1]-res[i];
	    printf("%d\n",diff);
	}
	else
	{
	    diff=res[i]-res[i+1];
	    printf("%d\n",diff);
	}
	}
	hour=diff/60;
	min=diff%60;
	printf("%d:%d",hour,min);
	return 0;
}
