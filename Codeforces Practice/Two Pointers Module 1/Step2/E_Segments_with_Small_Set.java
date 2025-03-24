import java.util.HashMap;
import java.util.Scanner;

public class E_Segments_with_Small_Set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[len];
        for(int i = 0; i<len; i++) arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        long res = 0; int l = 0;

        for(int r = 0; r<len; r++){
            if(map.containsKey(arr[r])) map.put(arr[r], map.get(arr[r]) + 1);
            else map.put(arr[r], 1);

            while(map.size() > k){
                map.put(arr[l], map.get(arr[l]) - 1);
                if(map.get(arr[l]) == 0) map.remove(arr[l]);
                l++;
            }

            res += r-l+1;
        }

        System.out.println(res);
    }
}