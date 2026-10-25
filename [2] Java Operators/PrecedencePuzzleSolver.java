/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        
        System.out.println("===== PRECEDENCE PUZZLE SOLVER =====");
        int a = 5;
        int b = 3;
        // Prediction: true
        System.out.println("Puzzle 1: " + (a + b * 2 < 12 + a - b));
        int y = 4;
        // Prediction: 10
        System.out.println("Puzzle 2: " + ((++y * 5 + 5) / 3));
        int p = 17;
        int q = 5;
        // Prediction: 8
        System.out.println("Puzzle 3: " + (p - q * 2 + 4 % 3));
    }  
}
