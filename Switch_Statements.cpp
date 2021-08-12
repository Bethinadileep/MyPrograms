//Basic Calculator Code in C++
#include<iostream>
using namespace std;
int main()
{
    char oper;
    cout << "Enter the any one Operator(+,-,*,/):";
    cin >> oper;
    int a,b;
    cout << "Enter the a and b values:";
    cin >> a >> b;
    switch(oper){
        case '+':
            cout << a + b << endl;
            break;
        case '-':
            cout << a - b << endl;
            break;
        case '*':
            cout << a * b << endl;
            break;
        case '/':
            cout << a / b << endl;
            break;
        default:
            cout << "Invalid Operator." << endl;
            break;
    }
    return 0;
}
