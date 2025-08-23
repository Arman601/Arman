
import java.util.Scanner;

public class sumOfDigits {
    static int Digits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int result = Digits(n);
        System.out.println(result);
        sc.close();
    }

}
