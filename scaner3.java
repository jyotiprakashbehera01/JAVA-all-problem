import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number to search
        System.out.print("Enter the number to search for: ");
        int x = sc.nextInt();

        // Search for the number
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(x + " not found in the array.");
        }

        sc.close();
    }
}
    

