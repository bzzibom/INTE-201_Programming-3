/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        
        int quantity = 3;
        double unitPrice = 14.99;
        String storeName = "Juice ni Bruce";

         // totalCost should not be an int because the price may contain decimal values.
        double totalCost = quantity * unitPrice;

        System.out.println("===== SHOPPING SUMMARY =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Cost: PHP " + totalCost);
    }   
}
