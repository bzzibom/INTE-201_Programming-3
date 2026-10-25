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
public class SumUntilSentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.println("===== SUM UNTIL SENTINEL VALUE =====");
        System.out.println("Enter integers to add (-1 to stop).");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -1) {
            total += number;

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println("Final Total: " + total);
    }
}
