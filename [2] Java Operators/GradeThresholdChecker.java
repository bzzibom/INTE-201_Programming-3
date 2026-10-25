/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        double average = 88.00;
        int absences = 2;

        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("===== GRADE THRESHOLD CHECKER =====");
        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
            if (average >= 90) {
                System.out.println("Reason: Average is at least 90, regardless of absences.");
            } else {
                System.out.println("Reason: Average is at least 75 and absences are not more than 3.");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Average is below 90 amd absences are more than 3.");
        }
    }
}
