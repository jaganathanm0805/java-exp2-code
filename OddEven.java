package exp2;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] odd = new int[10];
        int[] even = new int[10];
        int o = 0, e = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0)
                even[e++] = arr[i] * arr[i] * arr[i];
            else
                odd[o++] = arr[i] * arr[i]; 
        }

        // Output
        System.out.print("Original Array: ");
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Odd Array: ");
        for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");
        System.out.println();

        System.out.print("Even Array: ");
        for (int i = 0; i < e; i++) System.out.print(even[i] + " ");
        System.out.println();

        sc.close();
    }
}

