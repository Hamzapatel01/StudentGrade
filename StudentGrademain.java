import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please follow the instructions below:");
        System.out.println("======================");

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        Student student = new Student(name);

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade #" + i + ": ");
            double grade = scanner.nextDouble();
            student.addGrade(grade);
        }

        double average = student.calcAverage(numGrades);
        String letterGrade = student.getLetterGrade(average);

        System.out.println("Student Name: " + name);
        System.out.println("The average grade is: " + average);
        System.out.println("The letter grade you got is: " + letterGrade);

        scanner.close();
    }
}
