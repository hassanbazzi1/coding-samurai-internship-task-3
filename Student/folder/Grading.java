package folder;
import java.util.Scanner;
public class Grading implements File{
    private float[] assignmentGrades;
    private float[] quizGrades;
    private float[] examGrades;

    private float finalExamGrade;


    @Override
    public void GetGrades() {
        // Here we enter the number of assignments and the grade of each
        Scanner scamner = new Scanner(System.in);
        System.out.println("enter the number of your assignments:");
        int numAssignments = scamner.nextInt();
        assignmentGrades = new float[numAssignments];
        System.out.println("enter the assignment grades:");
        for (int i = 0; i < numAssignments; i++) {
            assignmentGrades[i] = scamner.nextFloat();
        }


        // Here we enter the number of quizzes and the grade of each quiz
        System.out.println("enter the number of your quizzes:");
        int quiznumbers = scamner.nextInt();
        quizGrades = new float[quiznumbers];
        System.out.println("enter you quiz grades:");
        for (int i = 0; i < quiznumbers; i++) {
            quizGrades[i] = scamner.nextFloat();
        }

        //here we enter the number of exams and the grades of each exam
        System.out.println("enter the number of exams: ");
        int examnumbers = scamner.nextInt();
        examGrades = new float[examnumbers];
        System.out.println("enter your exam grades:");
        for (int i = 0; i < examnumbers; i++) {
            examGrades[i] = scamner.nextFloat();
        }

        //here we enter the grade of the final exam
        System.out.println("Enter the grade of the final exam:");
        finalExamGrade = scamner.nextFloat();


    }




    @Override
    public void GradeScale() {
        float coursegrade = CalculateGrade();
        char letterGrade;
        //if-else statement to declare the grade scale
        if(coursegrade >= 90){
            letterGrade = 'A';
        }else if(coursegrade >= 80 ){
            letterGrade = 'B';
        } else if (coursegrade >= 70) {
            letterGrade = 'C';
        }else if (coursegrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("The Final Course Grade: "+coursegrade);
        System.out.println("The Grade Scale: "+letterGrade);
    }






    public float CalculateGrade() {
        float assignmentAvg = calculateAverage(assignmentGrades);
        float quizAvg = calculateAverage(quizGrades);
        float examAvg = calculateAverage(examGrades);

        // Calculate the overall course grade
        return 0.3f * assignmentAvg + 0.2f * quizAvg + 0.4f * examAvg + 0.1f * finalExamGrade;
    }





    private float calculateAverage(float[] grades) {
        if (grades == null || grades.length == 0) {
            return 0.0f;
        }

        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
