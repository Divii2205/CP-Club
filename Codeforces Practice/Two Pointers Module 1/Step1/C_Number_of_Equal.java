import java.util.Scanner;

public class C_Number_of_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for(int i = 0; i<a; i++) arrA[i] = sc.nextInt();
        for(int i = 0; i<b; i++) arrB[i] = sc.nextInt();
        
        int x = 0, y = 0, count = 0;

        while (x<a && y<b) {
            
            if(arrA[x] == arrB[y]){
                int countA = 1, countB = 1;

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