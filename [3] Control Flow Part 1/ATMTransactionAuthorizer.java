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
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String username1 = "Mark Jimuel Consular";
        String pin1 = "1118";
        double accountBalance = 1118000.00;
        String accountTier = "", denialReason = "";
        double dailyLimit = 0.00, withdrawalAmount = 0.00, feeRate = 0.00, transactionFee = 0.00, totalDeduction = 0.00;
      
        System.out.println("===== ATM Transaction Authorizer =====");
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        if (username.equals(username1)) {
            System.out.print("Enter 4-Digit PIN: ");
            String pin = input.nextLine();
            if (pin.equals(pin1)) {
                System.out.println("Login Successful!");
                 if (accountBalance < 50000) {
                     accountTier = "Bronze";
                     dailyLimit = 25000;
                } else if (accountBalance < 100000) {
                    accountTier = "Silver";
                    dailyLimit = 50000;
                } else if (accountBalance < 500000) {
                    accountTier = "Gold";
                    dailyLimit = 250000;
                } else {
                    accountTier = "Platinum";
                    dailyLimit = 500000;
                }
                
                System.out.println("\n===== Transaction Details =====");
                System.out.println("Account Tier: " + accountTier);
                System.out.printf ("Current Balance: PHP %.2f%n", accountBalance);
                System.out.print("Enter withdrawal amount: PHP ");
                withdrawalAmount = input.nextDouble();
                
                switch (accountTier) {
                    case "Bronze":
                        feeRate = 0.20;
                        break;
                    case "Silver":
                        feeRate = 0.15;
                        break;
                    case "Gold":
                        feeRate = 0.10;
                        break;
                    case "Platinum":
                        feeRate = 0.05;
                        break;
                }
                
                transactionFee = withdrawalAmount * feeRate;
                totalDeduction = withdrawalAmount + transactionFee;

                if (withdrawalAmount <= 0) {
                    denialReason = "Withdrawal amount must be greater than zero.";
                } else {
                    if (totalDeduction <= accountBalance) {

                        if (withdrawalAmount <= dailyLimit) {
                            System.out.println("Tier: " + accountTier);
                            System.out.printf("Withdrawal Amount: PHP %.2f%n", withdrawalAmount);
                            System.out.printf("Transaction Fee (%.2f%%): PHP %.2f%n", feeRate * 100, transactionFee);
                            System.out.printf("Total Deduction: PHP %.2f%n", totalDeduction);

                            if (totalDeduction <= accountBalance && withdrawalAmount <= dailyLimit) {
                                accountBalance -= totalDeduction;

                                System.out.println("Status: APPROVED");
                                System.out.printf("Remaining Balance: PHP %.2f%n", accountBalance);
                            } else {
                                System.out.println("Status: DENIED");
                                System.out.println("Reason: Transaction requirements not met.");
                            }

                        } else {
                            denialReason = "Withdrawal exceeds the daily limit for your tier.";
                        }

                    } else {
                        denialReason = "Insufficient balance to cover withdrawal and transaction fee.";
                    }
                }

                if (!denialReason.isEmpty()) {
                    System.out.println("\nStatus: DENIED");
                    System.out.println("Reason: " + denialReason);
                }

            } else {
                System.out.println("Login failed: Incorrect or Invalid 4-Digit PIN.");
            }
        } else {
            System.out.println("Login failed: Username not found.");
        }
    }
}
