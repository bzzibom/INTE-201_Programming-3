/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class SimpleGradeClassifier {
    public static void main(String[] args) {
        
        int score1 = 85;
        int score2 = 51;
        
        System.out.println("===== Grade Classifier =====");
        if (score1 >= 60) {
            System.out.println("Score: " + score1);
            System.out.println("PASSED");
        } else {
            System.out.println("Score: " + score1);
            System.out.println("FAILED");
        }
         if (score2 >= 60) {
            System.out.println("Score: " + score2);
            System.out.println("PASSED");
        } else {
            System.out.println("Score: " + score2);
            System.out.println("FAILED");
        }
    }
}
