#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> getSubsets(vector<int> &a, int startIdx, int target)
{
    if (startIdx == a.size())
    {
        if (target == 0)
        {
            return {{}};
        }
        return {};
    }
    auto ans1 = getSubsets(a, startIdx + 1, target);
    auto ans2 = getSubsets(a, startIdx + 1, target - a[startIdx]);
    vector<vector<int>> ans;
    for (auto subset : ans1)
    {
        ans.push_back(subset);
    }
    for (auto subset : ans2)
    {
        subset.insert(subset.begin(), a[startIdx]);
        ans.push_back(subset);
    }
    return ans;
}
int main()
{
    vector<int> a = {-1, 1, 2, 0, 0};
    int target = 1;
    vector<vector<int>> subsets = getSubsets(a, 0, target);
    for (auto &subset : subsets)
    {
        for (int x : subset)
        {
            cout << x << " ";
        }
        cout << endl;
    }
}