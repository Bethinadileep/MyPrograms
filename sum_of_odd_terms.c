#include <stdio.h>

int main()
{
    int n = 5;
    int sum = 0;
    int i = 1;
    while(n != 0) {
        if(i%2 != 0) {
            sum += i;
            n--;
        }
        i++;
        
    }
    printf("%d",sum);
    return 0;
}
