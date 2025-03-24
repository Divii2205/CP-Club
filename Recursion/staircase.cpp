#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> getWays(int cur, int n)
{
    if (cur > n)
        return {};
    if (cur == n)
        return {{}};
    auto ans1 = getWays(cur + 1, n);
    auto ans2 = getWays(cur + 2, n);
    vector<vector<int>> ans;
    for (auto arr : ans1)
    {
        arr.insert(arr.begin(), 1);
        ans.push_back(arr);
    }
    for (auto arr : ans2)

    {
        arr.insert(arr.begin(), 2);
        ans.push_back(arr);
    }
    return ans;
}
int main()
{
    int n = 10;
    vector<vector<int>> ways = getWays(0, n);
    for (auto &way : ways)
    {
        for (int step : way)
        {
            cout << step << " ";
        }
        cout << endl;
    }
}