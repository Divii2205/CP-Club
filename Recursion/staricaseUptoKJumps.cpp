#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> getWays(int cur, int n, int k)
{
    if (cur > n)
        return {}; /*no ways*/
    if (cur == n)
        return {{}}; /*one possible way*/
    
    vector<vector<int>> ans;
    for(int i = 1; i<=k; i++){
        auto ans1 = getWays(cur + i, n, k);
        for (auto arr : ans1)
        {
            // arr.insert(arr.begin(), i); /*time complexity = O(n), hence use push_back => O(1) */
            arr.push_back(i);
            ans.push_back(arr);
        }
    }
    return ans;
}
int main()
{
    int n, k; cin >> n >> k;
    vector<vector<int>> ways = getWays(0, n, k);
    for (auto &way : ways)
    {
        for (int step : way)
        {
            cout << step << " ";
        }
        cout << endl;
    }
}