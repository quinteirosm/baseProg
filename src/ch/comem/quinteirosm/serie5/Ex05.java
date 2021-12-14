package ch.comem.quinteirosm.serie5;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Ecrivez un nom");
        String nom = userInput.next();
        System.out.println(firstUpperRestLower(nom));
    }

    public static String firstUpperRestLower(String nom) {
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1).toLowerCase();
        return nom;
    }
}