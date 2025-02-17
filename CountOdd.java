import java.util.Scanner;
public class CountOdd {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
            odd++;
            } else {
            even++;
            }
        }
        scanner.close();
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }
}
