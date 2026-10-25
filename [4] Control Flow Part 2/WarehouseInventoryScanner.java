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
public class WarehouseInventoryScanner {
   static Scanner input = new Scanner(System.in);

    public static int restockShelf(int currentStock) {
        int quantity;

        System.out.println("\nCurrent stock: " + currentStock);

        while (true) {
            System.out.print("Enter quantity to add (greater than 0): ");
            quantity = input.nextInt();

            if (quantity > 0) {
                return currentStock + quantity;
            }

            System.out.println("Invalid quantity! Please enter a positive number.");
        }
    }

    public static void main(String[] args) {

        int[][] warehouse = {
            {20, 5, 12},
            {8, -1, 3},
            {15, 2, 10}
        };

        int choice;

        do {
            System.out.println("\n===== WAREHOUSE INVENTORY SCANNER =====");
            System.out.println("1. Display Warehouse Inventory");
            System.out.println("2. Calculate Total Inventory");
            System.out.println("3. Find First Critically Low Shelf");
            System.out.println("4. Restock a Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nWarehouse Inventory:");

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {
                            if (warehouse[row][col] == -1) {
                                System.out.print("[DAMAGED] ");
                            } else {
                                System.out.print(warehouse[row][col] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                continue;
                            }

                            total += warehouse[row][col];
                        }
                    }

                    System.out.println("Total inventory: " + total + " items");
                    break;

                case 3:
                    boolean found = false;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                continue; 
                            }

                            if (warehouse[row][col] < 5) {
                                System.out.println(
                                    "First critically low shelf found at row "
                                    + (row + 1) + ", column " + (col + 1)
                                    + " with " + warehouse[row][col] + " items."
                                );

                                found = true;
                                break; 
                            }
                        }

                        if (found) {
                            break; 
                        }
                    }

                    if (!found) {
                        System.out.println("No critically low shelves found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter row (1-3): ");
                    int rowChoice = input.nextInt();

                    System.out.print("Enter column (1-3): ");
                    int colChoice = input.nextInt();

                    if (rowChoice < 1 || rowChoice > warehouse.length
                        || colChoice < 1
                        || colChoice > warehouse[0].length) {

                        System.out.println("Invalid shelf position!");

                    } else if (warehouse[rowChoice - 1][colChoice - 1] == -1) {

                        System.out.println("This shelf is damaged and cannot be restocked.");

                    } else {
                        int rowIndex = rowChoice - 1;
                        int colIndex = colChoice - 1;

                        warehouse[rowIndex][colIndex] =
                            restockShelf(warehouse[rowIndex][colIndex]);

                        System.out.println("Restocking successful!");
                        System.out.println("Updated stock: "
                            + warehouse[rowIndex][colIndex] + " items");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Warehouse Inventory Scanner...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }

        } while (choice != 5); 
    }
}
