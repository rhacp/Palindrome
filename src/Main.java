import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int x) {
        int y = 0;
        int a;
        a = x;
        do {
            if (x < 0)
                return false;
            y = y + (a % 10);
            a = (a - (a % 10)) / 10;
            if (a != 0)
                y = y * 10;
        } while (a > 0);
        return (x == y);
    }

    public static void main(String[] args) {
        int x;
        boolean b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        x = scanner.nextInt();
        b = isPalindrome(x);
        System.out.println(b);
    }
}