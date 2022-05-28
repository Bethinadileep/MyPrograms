#include<stdio.h>

int main(){
    //pointer to pointer
    int n = 4;
    int *m;
    m = &n;
    int **y; 
    y = &m;
    printf("%d\n",**y);
    **y = *(*&m)
        = *(&n)
    int n = 4;
    float x = 3.14159f;
    int *m;
    m = &n;
    float *y;
    y = &x;
    //display the address of n
    printf("%p\n",m);
    display n through m 
    printf("%d\n",*m);
    display the address of x 
    printf("Address of n %p\n",y);
    display x through y 
    printf("%f\n",*y);
    int n = 4;
    display the address of n  
    printf("%p\n", &n);
    display n through indirection operator
   printf("%d\n",*&n);
    return 0;
} 
