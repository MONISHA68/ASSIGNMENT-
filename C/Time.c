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
	if(res[1]>res[0])
	{
	    diff=res[1]-res[0];
	    printf("%d mins\n",diff);
	}
	else
	{
	    diff=res[0]-res[1];
	    printf("%d mins\n",diff);
	}
	hour=diff/60;
	min=diff%60;
	printf("%d:%d",hour,min);
	return 0;
}
