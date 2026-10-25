/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class ClassRankingSystem {
    
     static class Student {
        String name;
        int[] quizzes;
        double average;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;

            int sum = 0;

            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            average = (double) sum / quizzes.length;
        }
    }

    static int searchRank(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                return getRank(students, i);
            }
        }

        return -1;
    }

    static int getRank(Student[] students, int index) {
        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].average > students[index].average) {
                rank++;
            }
        }

        return rank;
    }

    static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].average < students[j + 1].average) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] names = {"Jannah", "Mark Jimuel", "Femelyn", "Janel", "Joshua"};

        int[][] quizData = {
            {90, 85, 88, 92},
            {95, 90, 93, 94},
            {95, 89, 93, 94},
            {80, 85, 82, 83},
            {88, 86, 84, 90}
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        sortStudents(students);

        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s %s%n",
                          "Rank", "Name", "Average", "Quiz Scores");
        System.out.println("---------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 && students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f %s%n",
                    rank,
                    students[i].name,
                    students[i].average,
                    java.util.Arrays.toString(students[i].quizzes));
        }

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("\nEnter student name to search: ");
        String targetName = input.nextLine();

        int studentRank = searchRank(students, targetName);

        if (studentRank != -1) {
            System.out.println(targetName + "'s rank is: " + studentRank);
        } else {
            System.out.println("Student not found.");
        }
    }
}
