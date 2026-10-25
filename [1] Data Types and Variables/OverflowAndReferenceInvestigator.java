/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class OverflowAndReferenceInvestigator {
    public static void main(String[] args) {
        
         byte number = 127;
        System.out.println("===== BYTE OVERFLOW =====");
        System.out.println("Before Increment: " + number);

        number++;
        
        System.out.println("After Increment: " + number);

        String A = new String("Pumitik");
        String B = new String("Pumitik");
        String C = "Pumitik";

        System.out.println("\n===== STRING COMPARISON =====");

        // false, because text1 and text2 refer to different String objects created using new.
        System.out.println("A == B: " + (A == B));

        // true, because text1 and text2 contain the same characters.
        System.out.println("A.equals(B): " + A.equals(B));

        // false, because text1 refers to a new object, while text3 refers to the interned literal.
        System.out.println("A == C: " + (A == C));

        // true, because both Strings contain the same characters.
        System.out.println("A.equals(C): " + A.equals(C));

        // false, because text2 is a new object, while text3 refers to the interned literal.
        System.out.println("B == C: " + (B == C));

        // true, because both Strings contain the same characters.
        System.out.println("B.equals(C): " + B.equals(C));

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n===== SHARED ARRAY REFERENCE =====");
        System.out.println("Before Modification: " + array2[0]);

        array1[0] = 99;

        System.out.println("After Modification: " + array2[0]);
    }
}
