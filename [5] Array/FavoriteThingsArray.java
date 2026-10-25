/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

/**
 *
 * @author Bruce
 */
public class FavoriteThingsArray {
    public static void main(String[] args) {
         
        String[] favorites = {"Money", "Food", "Mobile Games", "Manhwa", "Movies"};

        System.out.println("===== MY FAVORITE THINGS =====");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("\nTotal number of favorites: " + favorites.length);
    }
}
