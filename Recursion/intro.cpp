#include<bits/stdc++.h>
using namespace std;

// Print hello n number of times
// void sayHello(int n)
// {
//     if(n == 0) return;
//     cout << "Hello" << endl;
//     sayHello(n-1);
// }

// Print numbers from 1 to n
void printN(int n)
{
    if(n==0) return;
    cout << n << endl;
    printN(n-1);
}

int main()
{
    // sayHello(10);
    printN(5);
}