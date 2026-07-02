
package day12.activity;

import java.util.Scanner;

public class Acivity8_Cabiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number of students: ");
        int studentCount = input.nextInt();
        System.out.print("Enter Number of Subjects: ");
        int subjectCount = input.nextInt();
        input.nextLine();
        
        String[][] studentRecords = new String[studentCount][subjectCount+2];
        String[] tempSubjects = new String[subjectCount];
        
        
        for (int i = 0; i < tempSubjects.length; i++) {
            System.out.print("Enter Subject name: ");
            tempSubjects[i] = input.nextLine();
        }
        
        for (int i = 0; i < studentRecords.length; i++) {
            System.out.print("Enter Student Name: ");
            studentRecords[i][0] = input.nextLine();
            int totalGrades = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter Grades for " + tempSubjects[j] + ": ");
                int grade = input.nextInt();
                totalGrades += grade;
                studentRecords[i][j + 1] = String.valueOf(grade);
            }
            input.nextLine();
            double average = (double) totalGrades / subjectCount;
            studentRecords[i][subjectCount + 1] = String.format("%.2f", average);
            
        }
        
        
        System.out.println("\n===== STUDENT RECORDS =====");

        System.out.printf("%-15s", "Student");

        for (String subject : tempSubjects) {
            System.out.printf("%-15s", subject);
        }

        System.out.printf("%-15s%n", "Average");

        for (String[] student : studentRecords) {

            for (String data : student) {
                System.out.printf("%-15s", data);
            }

            System.out.println();
        }

        input.close();
        
    }
}
