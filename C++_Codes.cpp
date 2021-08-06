#include <iostream>
#include <string>
using namespace std;

int add(int a,int b){ 
    int sum = a+b;
    return sum;
    return 0;
}
int sub(int a,int b){
    int sum = a-b;
    return sum;
    return 0;
}
int main()
{
    cout<<"Hello World";
    int arr[5][5] = {{1,2,3,4,5},{1,2,3,4,5}};
    cout << arr[1][3];
    //Strings
    string str1 = "Joy ";
    string str2 = "Adarsh";
    cout<<str1 + str2<<endl;
    cout<<str1.length()<<endl;
    cout<<str1.compare(str2)<<endl;
    if(str.compare(str1)>0){
        cout<<"Str1 is Greater"<<endl;
    }
    else{
        cout<<"Str2 is Greater"<<endl;
    }
    //Arrays
    int str[5] = {1,2,3,4,5};
    //Pointers
    int *p;
    
    p = &str[1];
    cout<<*p<<endl;
    int a =15;
    int b =50;
    //functions
    int total1 = add(a,b);
    //functions
    int total2 = sub(30,20);

    cout << total << endl;   
    
    cout << tot2 << endl;

    return 0;
}
