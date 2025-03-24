import java.util.Scanner;

public class A_Segment_with_Small_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long sum = sc.nextLong();

        int[] arr = new int[len];

        for(int i = 0; i<len; i++) arr[i] = sc.nextInt();

        int res = 0, l= 0;
        long x = 0;

        for(int i = 0; i<len; i++){
            x += arr[i];
            if(x <= sum) res = Math.max(res, i-l+1);
            while(x>sum){
                x -= arr[l];
                l++;
            }
        }

        System.out.println(res);
    }
}