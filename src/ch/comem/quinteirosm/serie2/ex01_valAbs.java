package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex01_valAbs {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un nombre :");
        double reel = userInput.nextDouble();

        double valeurAbsolue = Math.abs(reel);

        System.out.println("La valeur absolue de "+reel+" est "+valeurAbsolue+" .");
    }
}