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
public class NestedLoginValidator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String username1 = "Mark Jimuel Consular";
        String username2 = "Joshua Salemo";
        String password1 = "@mookable1118!!";
        String password2 = "@shuaaa0904!!";
        boolean accountLocked = false;

        System.out.println("===== LOGIN VALIDATION =====");
        System.out.print("Enter username: ");
        String username = input.nextLine();

        if (username.equals(username1)) {
            System.out.print("Enter password: ");
            String password = input.nextLine();
            if (password.equals(password1)) {
                accountLocked = true;
                if (!accountLocked) {
                    System.out.println("Login failed: Account is locked.");
                } else {
                    System.out.println("Login successful!");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        }
        else if (username.equals(username2)) {
            System.out.print("Enter password: ");
            String password = input.nextLine();
            if (password.equals(password2)) {
                if (accountLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        }else {
            System.out.println("Login failed: Username not found.");
        }
    }
}
