import java.util.Scanner;

public class check_prime_number {
    public static void main(String[] args) {
        int n, tmp;
        boolean is_prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        n = sc.nextInt();
        if (n > 0) {
            for (int i = 2; i <= n / 2; i++) {
                tmp = n % i;
                if (tmp == 0) {
                    is_prime = false;
                    break;
                }
            }

            if (is_prime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " 4is not a prime number");
            }
        }
        else {
            System.out.println("Please Enter The Positive Number");
        }
    }
    
}
