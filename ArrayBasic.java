
import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {
        // Array Basic concept
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Array input
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        // Array output
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The array Elenemt is " + arr[i]);

        }

    }

}
