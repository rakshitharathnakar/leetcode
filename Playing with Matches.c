#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--){
	    int a,b;
	    scanf("%d %d",&a,&b);
	    int sum=a+b;
	    
	    int arr[10]={6,2,5,5,4,5,6,3,7,6};
	    int cnt=0;
	    while(sum!=0){
	        int x=sum%10;
	        cnt=cnt+arr[x];
	        sum/=10;
	    }
	    printf("%d\n",cnt);
	    
	}
	return 0
