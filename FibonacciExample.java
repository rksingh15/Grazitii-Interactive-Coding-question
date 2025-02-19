import java.util.Scanner;

class FibonacciExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you want to print");
        int n = sc.nextInt();

        int a = 0, b = 1, count = 0;

        do {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count <= n);

        sc.close();
    }
}
