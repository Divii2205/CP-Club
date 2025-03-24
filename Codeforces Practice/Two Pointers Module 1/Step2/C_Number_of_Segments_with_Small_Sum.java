import java.util.Scanner;

public class C_Number_of_Segments_with_Small_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long sum = sc.nextLong();

        int[] arr = new int[len];

        for(int i = 0; i<len; i++) arr[i] = sc.nextInt();

        int l= 0;
        long x = 0, res = 0;

        for(int i = 0; i<len; i++){
            x += arr[i];
            while(x>sum){
                x -= arr[l];
                l++;
            } res += i-l+1;
        }

        System.out.println(res);
    }
}