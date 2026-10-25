/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class UnitCastingConverter {
    public static void main(String[] args) {
        
        double centimeters = 4951;

        int meters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println("===== UNIT CASTING CONVERTER =====");
        System.out.println("Total Centimeters: " + centimeters + " cm");
        System.out.println("Whole Meters: " + meters + " m");
        System.out.println("Remaining Centimeters: " + remainingCentimeters + " cm");

        /* In Implicit widening, int is automatically converted to double,
        so no cast is needed because double can store a wider range of numeric 
        values. */
        int number = 4951;
        double widenedNumber = number;

        System.out.println("\n===== IMPLICIT WIDENING =====");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + widenedNumber);

        /* In Explicit narrowing, converting double to int removes the decimal 
        part, which means the decimal part (.51) is lost, and the value becomes 
        49. */
        double decimalValue = 49.51;
        int narrowedValue = (int) decimalValue;

        System.out.println("\n===== EXPLICIT NARROWING =====");
        System.out.println("Original Double: " + decimalValue);
        System.out.println("Converted Integer: " + narrowedValue);
    }   
}
