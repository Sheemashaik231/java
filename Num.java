import java.util.*;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("it is even");
        } else {
            System.out.println("it is odd");
        }

    }

}
