/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class CompoundGrowthAndIncrementTracker {
    public static void main(String[] args) {
        
        double balance = 1000.00;

        System.out.println("===== COMPOUND GROWTH TRACKER =====");
        System.out.println("Initial Balance: PHP " + balance);

        balance += 200;
        System.out.println("First Increment (+= 49): PHP " + balance);
        balance *= 1.10;
        System.out.println("Second Increment (*= 1.5): PHP " + balance);
        balance += 100;
        System.out.println("Third Increment (+= 51): PHP " + balance);

        int count = 5;
        /* Postfix prints the original value first, then increments count,
        while prefix increments count first, then prints the updated value. */
        System.out.println("\n===== POSTFIX INCREMENT =====");
        System.out.println("count++: " + count++);
        System.out.println("Count after count++: " + count);

        System.out.println("\n===== PREFIX INCREMENT =====");
        System.out.println("++count: " + ++count);
        System.out.println("Count after ++count: " + count);
    }
}
