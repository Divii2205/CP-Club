#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> getPermutations(vector<int> &arr, int startIdx = 0)
{
    if (startIdx == arr.size())
    {
        return {{}};
    }
    auto smallAns = getPermutations(arr, startIdx + 1);
    vector<vector<int>> ans;
    for (auto perm : smallAns)

    {
        for (int idx = 0; idx <= perm.size(); idx++)
        {
            vector<int> temp = perm;
            temp.insert(temp.begin() + idx, arr[startIdx]);
            ans.push_back(temp);
        }
    }
    return ans;
}
int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    vector<vector<int>> perms = getPermutations(arr);
    for (auto perm : perms)
    {
        for (int x : perm)
        {
            cout << x << " ";
        }
        cout << endl;
    }
}