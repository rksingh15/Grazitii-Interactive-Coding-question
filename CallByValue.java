import java.util.*;
class CallByValue{

    static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers =>");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    swapNumbers(a, b);
    System.out.println("a=> " + a + " b=> " + b);
}

}