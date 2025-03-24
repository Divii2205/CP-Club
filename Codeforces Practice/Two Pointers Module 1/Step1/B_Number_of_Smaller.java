import java.util.Scanner;

public class B_Number_of_Smaller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for(int i = 0; i<a; i++) arrA[i] = sc.nextInt();
        for(int i = 0; i<b; i++) arrB[i] = sc.nextInt();
        
        int x = 0, y = 0;

        int count = 0;
        while (x<a || y<b) { 
            if(x == a || y<b && arrA[x] >= arrB[y]){
                System.out.print(count + " ");
                y++;
            } else if(x<a && y<b && arrA[x] < arrB[y]){
                x++; count++;
            } else break;
        }

        System.out.println();
    }
}