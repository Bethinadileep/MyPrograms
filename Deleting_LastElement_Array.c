//codeby : Dileep
#include <stdio.h>

int main() {
    // Write C code here
    int n,value,i;
    printf("Enter the Number for array");
    scanf("%d",&n);
    int arr[n];
    printf("Enter Elements in Array");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    value=arr[n-1];
    printf("Elements %d deleting at %d index \n",value,n-1);
    n=n-1;
    printf("New Array After Deleting at End \n ");
    for(i=0;i<n;i++){
        printf("%d \t",arr[i]);
    }
    return 0;
}
