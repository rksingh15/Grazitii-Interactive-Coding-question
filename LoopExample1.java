import java.util.Scanner;

class LoopExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("i=" + i);
        }

        sc.close();
    }
}
