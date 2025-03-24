import java.util.Scanner;
import java.util.TreeMap;

public class F_Segments_with_Small_Spread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[len];

        for(int i = 0; i<len; i++) arr[i] = sc.nextLong();

        long count = 0;
        int l = 0;

        TreeMap<Long, Integer> treeMap = new TreeMap<>();

        for(int r = 0; r<len; r++){
            treeMap.put(arr[r], treeMap.getOrDefault(arr[r], 0) + 1);

            while (treeMap.lastKey() - treeMap.firstKey() > k) {
                treeMap.put(arr[l], treeMap.get(arr[l]) - 1);
                if (treeMap.get(arr[l]) == 0) treeMap.remove(arr[l]);
                l++;
            }

            count += r-l+1;
        }

        System.out.println(count);
    }
}