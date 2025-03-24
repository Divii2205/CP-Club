import java.util.*;

public class staircase{
    public static List<List<Integer>> getWays(int cur, int n) {
        if (cur > n)
            return new ArrayList<>();
        if (cur == n) {
            List<List<Integer>> baseCase = new ArrayList<>();
            baseCase.add(new ArrayList<>());
            return baseCase;
        }
        
        List<List<Integer>> ans1 = getWays(cur + 1, n);
        List<List<Integer>> ans2 = getWays(cur + 2, n);
        List<List<Integer>> ans = new ArrayList<>();
        
        for (List<Integer> arr : ans1) {
            List<Integer> temp = new ArrayList<>(arr);
            temp.add(0, 1);
            ans.add(temp);
        }
        for (List<Integer> arr : ans2) {
            List<Integer> temp = new ArrayList<>(arr);
            temp.add(0, 2);
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> ways = getWays(0, n);
        
        for (List<Integer> way : ways) {
            for (int step : way) {
                System.out.print(step + " ");
            }
            System.out.println();
        }
    }
}