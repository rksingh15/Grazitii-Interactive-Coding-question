import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number => \n1 --> Ascending\n2 --> Descending");
        int ch = sc.nextInt();

        Arrays.sort(array);

        if (ch == 1) {
            System.out.println("Ascending order is:");
            for (int num : array) {
                System.out.println(num);
            }
        } else if (ch == 2) {
            System.out.println("Descending order is:");
            for (int i = size - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Invalid input !");
        }
    }
}