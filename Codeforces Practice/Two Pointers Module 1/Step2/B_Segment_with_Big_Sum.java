import java.util.Scanner;

public class B_Segment_with_Big_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long sum = sc.nextLong();

        int[] arr = new int[len];

        for(int i = 0; i<len; i++) arr[i] = sc.nextInt();

        int res = Integer.MAX_VALUE, l= 0;
        long x = 0;

        for(int i = 0; i<len; i++){
            x += arr[i];
            if(x >= sum) res = Math.min(res, i-l+1);
            while(x - arr[l]>=sum){
                x -= arr[l];
                l++;
                res = Math.min(res, i-l+1);
            }
        }

        if(res == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(res);
    }
}