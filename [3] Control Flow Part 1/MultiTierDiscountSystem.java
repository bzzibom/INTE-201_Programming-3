/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        
        double purchaseAmount = 4951.00;
        double discountRate;

        if (purchaseAmount < 500) {
            discountRate = 0.00;
        } else if (purchaseAmount < 1000) {
            discountRate = 0.05;
        } else if (purchaseAmount < 2000) {
            discountRate = 0.10;
        } else {
            discountRate = 0.15;
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountRate);

        System.out.println("===== DISCOUNT SYSTEM =====");
        System.out.println("Purchase Amount: PHP " + purchaseAmount);
        System.out.println("Discount Tier: " + discountRate * 100 + "%");
        System.out.println("Final Discounted Price: PHP " + finalPrice);
    }
}
