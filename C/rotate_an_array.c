#include<stdio.h>
int main()
{
 int a[100];
 int n,k,i,j,temp=0;
 scanf("%d\n",&n);
  scanf("%d\n",&k);
 for(i=0;i<n;i++)
 {
     scanf("%d",&a[i]);
 }
 
 for(j=0;j<k;j++);
 {
     temp=a[0];
 for(i=0;i<n-1;i++)
 {
     a[i]=a[i+1];
 }
    a[i]=temp;
 }
 
 for(i=0;i<n;i++)
 {
     printf("%d  ",a[i]);
 }
	return 0;
}
