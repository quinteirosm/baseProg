package ch.comem.quinteirosm.serie1;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Quelle est la largeur de la pièce :");
        double longueur = userInput1.nextDouble();
        Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Quelle est la longueur de la pièce :");
        double largeur = userInput2.nextDouble();
        Scanner userInput3 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Quelle est la hauteur de la pièce :");
        double hauteur = userInput3.nextDouble();

        double surfaceSol = longueur*largeur;
        double surfaceMur = (longueur*hauteur)*2+(largeur*hauteur)*2;

        System.out.println("La surface au sol est de : "+surfaceSol+"[m2]");
        System.out.println("La surface des murs est de : "+surfaceMur+"[m2]");
    }
}