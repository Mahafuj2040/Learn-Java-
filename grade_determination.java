
import java.util.Scanner;

public class grade_determination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's Mark : ");
        int mark = scanner.nextInt();
        // int mark;
        if (mark <= 100 && mark >= 0) {
            String grade;
            switch (mark / 10) {
                case 10:
                case 9:
                case 8:
                    grade = "A+";
                    break;
                case 7:
                    grade = "A";
                    break;
                case 6:
                    grade = "B";
                    break;
                case 5:
                    grade = "C";
                    break;
                case 4:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
            
            System.out.println("The Student grade is : " + grade);
            
        }
        else {
            System.out.println("Ivalid Input!-------Enter the student valid mark(0-100).");
        }
        
        
        
    }
}
