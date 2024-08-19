
import java.util.Scanner;

class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        int i=0;
        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }
        sc.close();
    }
}