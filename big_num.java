// import java.io.*;
import java.util.Scanner;


public class big_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int first = sc.nextInt();
        System.out.print("Enter Your Second Number : ");
        int second = sc.nextInt();
        System.out.print("Enter Your Third Number : ");
        int third = sc.nextInt();

        System.out.println("------------");

        if (first > second && first > third) {
            System.out.println("First number is grater than other.");
        }
        else if (second > first && second > third) {
            System.out.println("Second number is grater than other.");
        }
        else {
            System.out.println("Third number is grater than other");
        }


    }
}
