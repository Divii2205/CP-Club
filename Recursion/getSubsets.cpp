#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> getSubsets(vector<int> &a, int startIdx)
{
    if (startIdx == a.size())
    {
        return {{}}; // [[]]
    }
    auto smallAns = getSubsets(a, startIdx + 1);
    vector<vector<int>> ans;
    for (auto subset : smallAns)
    {
        ans.push_back(subset);
    }
    for (auto subset : smallAns)
    {
        vector<int> temp = subset;
        temp.insert(temp.begin(), a[startIdx]);
        ans.push_back(temp);
    }
    return ans;
}
int main()
{
    vector<int> a = {1, 2, 3, 4, 5, 6, 7, 8};
    int target = 10;
    vector<vector<int>> subsets = getSubsets(a, 0);
    for (auto &subset : subsets)
    {
        int sum = accumulate(subset.begin(), subset.end(), 0);
        if (sum == target)
        {
            for (int x : subset)
            {

                cout << x << " ";
            }
            cout << endl;
        }
    }
}