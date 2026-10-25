/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;
import java.util.Scanner;

/**
 *
 * @author Bruce
 */
public class FourFunctionCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Read two integers from the user
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Display arithmetic results
        System.out.println("\n===== CALCULATOR RESULTS =====");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        // The results for division operations always rounds toward zero.
        System.out.println("Division: " + (num1 / num2));
        // The results for mudulo operations will always take the sign of the dividend or the first entered number.
        System.out.println("Modulus: " + (num1 % num2));
    }
}
