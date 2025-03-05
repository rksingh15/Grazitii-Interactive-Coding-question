import java.util.Scanner;

class CallByObject {
    int a, b;

    void swap(CallByObject obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallByObject obj = new CallByObject();

        System.out.println("Enter the values of a and b");
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();

        obj.swap(obj);

        System.out.println("After swapping  a = " + obj.a);
        System.out.println("B = " + obj.b);
    }
}
