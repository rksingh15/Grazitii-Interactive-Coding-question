import java.util.Scanner;

class FloydExample30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Floyd triangle");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }

        sc.close();
    }
}
