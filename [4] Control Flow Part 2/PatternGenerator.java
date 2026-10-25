/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class PatternGenerator {
    public static void main(String[] args) {
        int size = 10;

        System.out.println("===== PATTERN GENERATOR =====");

        for (int row = 1; row <= size; row++) {

            /* continue will entirely skip row 3, that is why after row 2 with 
            2 asterisks, the next row will the value of row 4 with 4 asterisks */
            if (row == 3) {
                continue;
            }

            for (int col = 1; col <= row; col++) {

                /* break limits the number of asterisks printed, as shown, no
                more than 7 asterisks will be printed */
                if (col == 8) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
