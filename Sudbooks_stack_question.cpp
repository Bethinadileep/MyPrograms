#include<bits/stdc++.h>
using namespace std;


#define int long long
#define ull unsigned long long
#define endl '\n'
#define pii pair<int, int>
#define ff first
#define ss second
#define pb push_back
#define mk make_pair
#define all(v) v.begin(),v.end()


signed main()
{
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    int q;
    cin>>q;

    stack<int> s;

    while(q--)
    {
        int type;
        cin >> type;

        if(type == 1)
        {
            int n;
            cin>>n;
            s.push(n);
        }
        else
        {
            if(s.empty()){
                cout << "Kuchbhi?" <<endl;
            }
            else
            {
                cout <<s.top() <<endl;
                s.pop();
            }
        }
    }

    return 0;

}

