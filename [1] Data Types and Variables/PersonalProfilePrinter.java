/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class PersonalProfilePrinter {
    public static void main(String[] args) {
       
        int age = 19;
        double height = 1.70;
        char initial = 'B';
        boolean studentStatus = true;
        String fullName = "Bruce Silvestre";
        
        System.out.println("===== PERSONAL PROFILE =====");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Initial: " + initial);
        System.out.println("Student Status" + (studentStatus ? "Enrolled" : "Not Enrolled"));
    }
}
