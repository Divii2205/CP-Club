#include <bits/stdc++.h>
using namespace std;

void getSubsets(vector<int> &a, int curIdx, int target, string subset)
{
    if (curIdx == a.size())
    {
        if (target == 0)
        {
            cout << subset << endl;
        }
        return;
    }
    ans1 = getSubsets(a, curIdx + 1, target, subset);
    ans2 = getSubsets(a, curIdx + 1, target - a[curIdx], subset + " " to_string(a[curIdx]));

}
int main()
{
    int n, k; cin >> n >> k;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    // vector<int> a = {-1, 1, 2, 0, 0};
    // int target = 1;
    getSubsets(arr, 0, k, "");
}