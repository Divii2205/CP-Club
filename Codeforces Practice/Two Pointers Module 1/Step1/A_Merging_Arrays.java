
import java.util.Scanner;

public class A_Merging_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for(int i = 0; i<a; i++) arrA[i] = sc.nextInt();
        for(int i = 0; i<b; i++) arrB[i] = sc.nextInt();

        int[] ans = new int[a+b];
        int x = 0, y = 0, k = 0;
        
        while(x<a || y<b){
            if(y == b || x<a && arrA[x]<arrB[y]){
                ans[k] = arrA[x];
                x++; k++;
            } else {
                ans[k] = arrB[y];
                y++; k++;
            }
        }

        for(int i = 0; i<ans.length; i++) System.out.print(ans[i] + " ");
        System.out.println();
    }
}