
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        int i = 0;
        
        do { 
            System.out.print(n+" ");
            n--;
        } while (n>=i);
    }
}
