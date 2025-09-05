package exp2;
import java.util.Scanner;

public class UniqueNumbersEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n;
        System.out.print("Enter total numbers: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find unique numbers
        int count = 0;
        System.out.print("Unique numbers are: ");
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq == 1) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println("\nCount = " + count);
        sc.close();
    }
}
