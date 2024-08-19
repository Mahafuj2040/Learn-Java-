
import java.util.Scanner;

public class different_primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            boolean prime = true;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0 && j != i) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
