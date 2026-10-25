/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Bruce
 */
public class SearchAndSortMiniTool {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Original scores array
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 81};

        System.out.println("===== SEARCH & SORT MINI-TOOL =====");
        System.out.println("Original Array: " + Arrays.toString(scores));

        // Linear search for a target score
        System.out.print("\nEnter score to search: ");
        int target = input.nextInt();

        int index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Score " + target + " found at index " + index + ".");
        } else {
            System.out.println("Score " + target + " was not found.");
        }

        /* Sort a copy to preserve the original order of scores especially when 
        other calculations or searches still need the original array. matters if. */
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        Arrays.sort(sortedScores);

        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));
    }
}
