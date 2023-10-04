package folder;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Grading grade = new Grading();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n Options:");
            System.out.println("1.Input Grades");
            System.out.println("2.Calculate and Display Course Grade");
            System.out.println("3.Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch(choice){
                case 1:
                    grade.GetGrades();
                    break;
                case 2:
                    grade.GradeScale();
                    break;
                case 3:
                    System.out.println("Exiting Process!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }

        }

    }
}
