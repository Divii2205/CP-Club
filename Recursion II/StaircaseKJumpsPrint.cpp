#include <bits/stdc++.h>
using namespace std;

void getWays(int cur, int n, string &path)
{
    // doing our work then calling recursion
    if (cur == n)
    {
        cout << path << endl;
        return;
    }
    if (cur > n)
    {
        return;
    }

    // getWays(cur + 1, n, " 1");
    // getWays(cur + 2, n, " 2");

    // another variation => saves both time and space! 
    // all operations are being done on a single global string
    path += " 1";
    getWays(cur + 1, n, " 1");
    path.pop_back();

    path += " 2";
    getWays(cur + 2, n, " 2");
    path.pop_back();
}
int main()
{
    int n; cin >> n;
    string path;
    getWays(0, n, path);
}