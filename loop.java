
import java.util.Scanner;



public class loop {
    public static void main(String arrs[]) {

        // for (int counter = 0; counter <= 100; counter++) {
        //     System.out.print(counter + " ");
        // }
        // int i = 0;
        // while (i < 11) {
        //     System.out.print(i+" ");
        //     i = i + 1;
        // }
        // do{
        //     System.out.println(i);
        //     i++;
        // } while (i < 11);
        System.out.println("It works");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        // System.out.println("Your Number : " + a);

        // int sum = 0;
        // for (int i = 0; i <= a; i++) {
        //     sum += i;
        // }
        // System.out.println("Your sum is : " + sum);


        for (int i = 1; i <= 10; i++) {
            int multiply = a * i;
            System.out.println(a + "*" + i + "=" + multiply);
        }
        
    }
    
}
