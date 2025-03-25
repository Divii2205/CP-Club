import java.util.Scanner;

public class C_Number_of_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long[] arrA = new long[a];
        long[] arrB = new long[b];

        for(int i = 0; i<a; i++) arrA[i] = sc.nextLong();
        for(int i = 0; i<b; i++) arrB[i] = sc.nextLong();
        
        int x = 0, y = 0;
        long count = 0;

        while (x<a && y<b) {
            
            if(arrA[x] == arrB[y]){
                long countA = 1, countB = 1;

                while (x + 1 < a && arrA[x] == arrA[x + 1]){
                    x++; countA++;
                }
                while (y + 1 < b && arrB[y] == arrB[y + 1]){
                    y++; countB++;
                }

                count += countA * countB;
                x++; y++;
            } else if(arrA[x] < arrB[y]) x++;
            else y++;
        }

        System.out.println(count);
    }
}